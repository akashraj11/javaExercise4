import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHenryTest {
    FindHenry henry;
    @Before
    public void setUp() throws Exception {
        henry = new FindHenry();
    }

    @After
    public void tearDown() throws Exception {
        henry = null;
    }

    @Test
    public void findHenry() {
        //Arrange
        String str ="I am Henry";
        boolean expectedValue = true;
        //Act
        boolean actualValue= henry.findHenry(str);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}