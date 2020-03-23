package by.pasha.person;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Ignore
public class Person1Test {
    private Person person;

    @Before
    public void before() {
        person = new Person("John", "Smit");
    }

    @Test
    public void testFullName() {
        System.out.println("MYDEBUG 2");
        assertEquals("John Smit", person.getFullName());
    }
}
