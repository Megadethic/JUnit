package by.pasha.person;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Person1Test.class, Person2Test.class})
public class AllPersonsTest {
    /*
    Tests with the following files are visible: Test*, *Test, *TestCase.
    Suite joins tests to run together.
    Person1Test and Person2Test are not visible but you can run them together here if needs
    */
}
