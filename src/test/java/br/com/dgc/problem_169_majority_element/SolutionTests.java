package br.com.dgc.problem_169_majority_element;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void example1(){
        Solution solution = new Solution();
        int[] nums = {3,2,3};
        int res = solution.majorityElement(nums);
        assertEquals(3, res);
    }

    @Test
    public void example2(){
        Solution solution = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        int res = solution.majorityElement(nums);
        assertEquals(2, res);
    }

    @Test
    public void afterSubmit(){
        Solution solution = new Solution();
        int[] nums = {-1,1,1,1,2,1};
        int res = solution.majorityElement(nums);
        assertEquals(1, res);
    }
}
