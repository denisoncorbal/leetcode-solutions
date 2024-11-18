package br.com.dgc.problem_26_remove_duplicates_from_sorted_array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class Solution2Tests {
    @Test
    public void example1() {
        int[] nums = { 1, 1, 2 };
        Solution2 solution = new Solution2();
        int res = solution.removeDuplicates(nums);
        assertEquals(2, res);
        for (int i = 0; i <= res - 2; i++) {
            for (int j = i + 1; j <= res - 1; j++) {
                assertNotEquals(nums[i], nums[j]);
            }
        }
    }

    @Test
    public void example2() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        Solution2 solution = new Solution2();
        int res = solution.removeDuplicates(nums);
        assertEquals(5, res);
        for (int i = 0; i <= res - 2; i++) {
            for (int j = i + 1; j <= res - 1; j++) {
                assertNotEquals(nums[i], nums[j]);
            }
        }
    }

    @Test
    public void afterSubmit() {
        int[] nums = { 1, 1 };
        Solution2 solution = new Solution2();
        int res = solution.removeDuplicates(nums);
        assertEquals(1, res);
        for (int i = 0; i <= res - 2; i++) {
            for (int j = i + 1; j <= res - 1; j++) {
                assertNotEquals(nums[i], nums[j]);
            }
        }
    }

    @Test
    public void afterSubmit2() {
        int[] nums = { 1, 1, 2 };
        Solution2 solution = new Solution2();
        int res = solution.removeDuplicates(nums);
        assertEquals(2, res);
        for (int i = 0; i <= res - 2; i++) {
            for (int j = i + 1; j <= res - 1; j++) {
                assertNotEquals(nums[i], nums[j]);
            }
        }
    }
}
