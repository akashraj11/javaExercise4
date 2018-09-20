import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortParaWordsTest {
    SortParaWords sortPara;
    @Before
    public void setUp() throws Exception {
        sortPara = new SortParaWords();
    }

    @After
    public void tearDown() throws Exception {
        sortPara = null;
    }

    @Test
    public void sortParaWords() {
        //Arrange
        String str ="i am akash";
        String expectedValue = "i am aahks";
        //Act
        String actualValue= sortPara.sortParaWords(str);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}