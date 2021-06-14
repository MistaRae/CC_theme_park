package people;

import ThemePark.attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Attraction> getVisitedAttractions() {
        return visitedAttractions;
    }



    public void buyTicket(double ticketPrice){
        this.money -= ticketPrice;
    }

    public void addToVisitedAttractions(Attraction attraction){
        visitedAttractions.add(attraction);
    }


    public int countAttractionsVisited() {
        return this.visitedAttractions.size();
    }
}
