import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeWordsTest {
    TransposeWords tw;
    @Before
    public void setUp() throws Exception {
        tw = new TransposeWords();
    }

    @After
    public void tearDown() throws Exception {
        tw = null;
    }

    @Test
    public void transposeWords() {
        //Arrange
        String str ="a quick brown fox jumps over the lazy dog";
        String expectedValue = "a kciuq nworb xof spmuj revo eht yzal god";
        //Act
        String actualValue= tw.transposeWords(str);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}