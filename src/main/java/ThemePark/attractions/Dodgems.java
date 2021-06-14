package ThemePark.attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return defaultPrice() / 2;
        } else
        return defaultPrice();
    }

    public String sellTicket(Visitor visitor){
        double ticketPrice = priceFor(visitor);
        if (visitor.getMoney() > ticketPrice) {
            visitor.buyTicket(ticketPrice);
            return "ticket sold";
        } else return "this visitor may not buy a ticket";
    }

}
