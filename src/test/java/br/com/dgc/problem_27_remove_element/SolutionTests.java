package br.com.dgc.problem_27_remove_element;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SolutionTests {
    @Test
    public void example1(){
        int[] nums = {3,2,2,3};
        int val = 3;
        Solution solution = new Solution();
        int res = solution.removeElement(nums, val);
        assertEquals(2, res);
        for(int i = 0; i<res;i++){
            assertNotEquals(val, nums[i]);
        }
    }

    @Test
    public void example2(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        Solution solution = new Solution();
        int res = solution.removeElement(nums, val);
        assertEquals(5, res);
        for(int i = 0; i<res;i++){
            assertNotEquals(val, nums[i]);
        }
    }

    @Test
    public void afterSubmit1(){
        int[] nums = {1};
        int val = 1;
        Solution solution = new Solution();
        int res = solution.removeElement(nums, val);
        assertEquals(0, res);
        for(int i = 0; i<res;i++){
            assertNotEquals(val, nums[i]);
        }
    }
}
