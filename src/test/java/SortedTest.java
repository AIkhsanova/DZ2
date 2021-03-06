import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedTest {

    @Test
    public void simpleTest() {
        int[] i = {5, 3, 10, 20, 0, 1};
        int[] expectedArray = {0, 1, 3, 5, 10, 20};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }


    @Test
    public void simTest() {
        int[] i = {1, 1, 1, 1, 1, 1};
        int[] expectedArray = {1, 1, 1, 1, 1, 1};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void bigTest() {
        int[] i = {1, 4, 8, 2, 1000, 300};
        int[] expectedArray = {1, 2, 4, 8, 300, 1000};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }


    @Test
    public void negTest() {
        int[] i = {-3, 4, 3, 2, -5, 1};
        int[] expectedArray = {-5, -3, 1, 2, 3, 4};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }


    @Test
    public void zeroTest() {
        int[] i = {0, 0, 0, 0, 0, 0};
        int[] expectedArray = {0, 0, 0, 0, 0, 0};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }


    @Test
    public void oneTest() {
        int[] i = {5};
        int[] expectedArray = {5};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void emptyTest() {
        int[] i = {};
        int[] expectedArray = {};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }


    @Test
    public void BestSortedTest() {
        int[] i = {3, 7, 9, 10, 14, 40};
        int[] expectedArray = {3, 7, 9, 10, 14, 40};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void WorseSortedTest() {
        int[] i = {30, 15, 4, 3, 1, 0};
        int[] expectedArray = {0, 1, 3, 4, 15, 30};
        SortedThanos.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }


}
