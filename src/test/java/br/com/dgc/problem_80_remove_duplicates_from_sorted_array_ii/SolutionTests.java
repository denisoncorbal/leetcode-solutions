package br.com.dgc.problem_80_remove_duplicates_from_sorted_array_ii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void example1(){
        Solution solution = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int res = solution.removeDuplicates(nums);
        assertEquals(5, res);
    }

    @Test
    public void example2(){
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int res = solution.removeDuplicates(nums);
        assertEquals(7, res);
    }
}
