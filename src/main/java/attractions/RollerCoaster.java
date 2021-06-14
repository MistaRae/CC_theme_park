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
        if (visitor.getHeight() > 2.00) {
            return defaultPrice() * 2;
        } else return defaultPrice();
    }

    @Override
    public String sellTicket(Visitor visitor) {
        double ticketPrice = priceFor(visitor);
        if (isAllowedTo(visitor) && visitor.getMoney() > ticketPrice) {
            visitor.buyTicket(ticketPrice);
            return "ticket sold";
        } else return "this visitor may not buy a ticket";
    }
}
