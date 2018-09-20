import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMultiplOccuranceTest {
     FindMultiplOccurance findMultiple;
    @Before
    public void setUp() throws Exception {
        findMultiple = new FindMultiplOccurance();
    }

    @After
    public void tearDown() throws Exception {
        findMultiple = null;
    }

    @Test
    public void findMultipleOccurance() {
        //Arrange
        String str ="She sells seashells by the seashore";
        String expectedValue = "found at 4 - 6" +'\n'+ "found at 10 - 12" + '\n'+ "found at 27 - 29" +'\n';
        //Act
        String actualValue= findMultiple.findMultipleOccurance(str,"se");
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}