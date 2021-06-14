import ThemePark.ThemePark;
import ThemePark.attractions.Attraction;
import ThemePark.attractions.RollerCoaster;
import ThemePark.stalls.Stall;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private RollerCoaster rollerCoaster;
    private Visitor visitor;
    private Visitor visitor2;
    private Visitor visitor3;
    private Visitor visitor4;


    @Before
    public void setUp(){
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
        themePark = new ThemePark("zombieland", attractions, stalls );
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(20, 2.0, 40.0);
        visitor3 = new Visitor(20, 1.50, 40.0);
        visitor4 = new Visitor(999, 2.01, 40.0);
    }

    @Test
    public void parkVisitAddsToVisitedAttractionsOnVisitor(){
        themePark.visit(visitor3,rollerCoaster);
        assertEquals(1, visitor3.countAttractionsVisited());
    }

    @Test
    public void parkIncrementsVisitCount(){
        themePark.visit(visitor3,rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
    }

}
