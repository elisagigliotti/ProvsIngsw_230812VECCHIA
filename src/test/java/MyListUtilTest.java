import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyListUtilTest {

    private MyListUtil myListUtil;
    private List<Integer> numbers;

    @Before
    public void setUp() {
        myListUtil = new MyListUtil();
        numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
    }

    @Test
    public void testSortAscending() {
        List<Integer> sortedList = myListUtil.sort(numbers, 0);
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9);
        assertEquals(expected, sortedList);
    }

    @Test
    public void testSortDescending() {
        List<Integer> sortedList = myListUtil.sort(numbers, 1);
        List<Integer> expected = Arrays.asList(9, 6, 5, 5, 5, 4, 3, 3, 2, 1, 1);
        assertEquals(expected, sortedList);
    }
}
