package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > getRating() && visitor.getHeight() > 1.45) {
            return true;
        } else return false;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }
}
