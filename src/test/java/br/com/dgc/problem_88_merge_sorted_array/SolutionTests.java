package br.com.dgc.problem_88_merge_sorted_array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    public void example1(){
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        int[] res =  {1,2,2,3,5,6};

        assertArrayEquals(res, nums1);
    }

    @Test
    public void example2(){
        Solution solution = new Solution();
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        solution.merge(nums1, m, nums2, n);
        int[] res =  {1};

        assertArrayEquals(res, nums1);
    }

    @Test
    public void example3(){
        Solution solution = new Solution();
        int[] nums1 ={0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        solution.merge(nums1, m, nums2, n);
        int[] res =  {1};

        assertArrayEquals(res, nums1);
    }
}
