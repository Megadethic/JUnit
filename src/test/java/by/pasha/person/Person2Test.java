package by.pasha.person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Person2Test {
    private Person person;

    @Before
    public void before() {
        person = new Person("Michael", "Jordan");
    }

    @Test
    public void testAbbreviation() {
        System.out.println("MYDEBUG 3");
        assertEquals("M. J.", person.getAbbreviation());
    }
}
