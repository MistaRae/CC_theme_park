package ThemePark;

import ThemePark.attractions.Attraction;
import ThemePark.stalls.Stall;
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
        visitor.addToVisitedAttractions(attraction);
        attraction.setVisitCount();


    }

}
