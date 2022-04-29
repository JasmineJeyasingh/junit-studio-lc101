package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    @Test
    public void indexPositionChecking() {
        int[] myArray = {4, 8, 13, 25, 34};
        assertEquals(1, BonusBinarySearch.binarySearch(myArray, 8));
    }
}
