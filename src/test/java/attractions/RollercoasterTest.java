package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(20, 2.0, 40.0);
        visitor3 = new Visitor(20, 1.0, 40.0);
        visitor4 = new Visitor(999, 1.46, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void failSecurityCheckAge(){
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void passSecurityCheckAge(){
        assertTrue(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void failSecurityCheckHeight() {
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void passSecurityCheckHeight() {
        assertTrue(rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void chargesForEntry(){

        assertEquals(31.60, visitor4.getMoney(), 0.00);
    }

}
