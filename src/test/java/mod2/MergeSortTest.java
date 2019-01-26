package mod2;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MergeSortTest {

    @Test
    public void whenWeHaveTwoSortArraysThenReturnOneSortArray() {

        MergeSort mergeSort = new MergeSort();
        int[] array1 = {1, 4, 7, 14, 22};
        int[] array2 = {2, 8, 13, 15, 24};

        int[] array3 = {1, 2, 4, 7, 8, 13, 14, 15, 22, 24};

        assertThat(array3, is(mergeSort.mergeArrays(array1, array2)));

        System.out.println(Arrays.toString(array3));





    }
}
