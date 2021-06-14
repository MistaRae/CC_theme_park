package ThemePark;

import ThemePark.attractions.Attraction;
import ThemePark.stalls.Stall;
import behaviours.IReviewed;
import people.Visitor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private HashMap<String, Integer> reviews;

    public ThemePark(String name, ArrayList attractions, ArrayList stalls) {
        this.name = name;
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviews = new HashMap<>();
    }

    public void visit(Visitor visitor, Attraction attraction){
        if (attraction.sellTicket(visitor)) {
            visitor.addToVisitedAttractions(attraction);
            attraction.setVisitCount();
        }

    }

    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor){
        ArrayList<IReviewed> allowed = new ArrayList<>();
        int age = visitor.getAge();
        double height = visitor.getHeight();
        if (age >= 18){
            allowed = ;
            return allowed;
        } else if (age >= 15) {
            allowed = ;
            return allowed;
        } else if (age >= 12 && height >= 1.45){
            allowed = ;
            return allowed;
        }
    }
}
