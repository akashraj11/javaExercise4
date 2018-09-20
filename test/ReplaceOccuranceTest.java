import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceOccuranceTest {
        ReplaceOccurance replacer;
    @Before
    public void setUp() throws Exception {
        replacer = new ReplaceOccurance();
    }

    @After
    public void tearDown() throws Exception {
        replacer =null;
    }

    @Test
    public void replaceOccurance() {
        //Arrange
        String str ="daily dry";
        String expectedValue = "faity fry";
        //Act
        String actualValue= replacer.replaceOccurance(str);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}