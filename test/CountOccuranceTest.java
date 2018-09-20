import static org.junit.Assert.*;

public class CountOccuranceTest {
    CountOccurance countOcc;
    @org.junit.Before
    public void setUp() throws Exception {
        countOcc= new CountOccurance();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        countOcc= null;
    }

    @org.junit.Test
    public void countOccurance() {
        //Arrange
        String str ="abcabcabcabc";
        int expectedValue = 4;
        //Act
        int actualValue= countOcc.countOccurance(str,'a');
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}