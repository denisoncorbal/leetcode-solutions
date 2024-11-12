package br.com.dgc.problem_27_remove_element;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int removedElementsCounter = 0;
        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                while (j > i && nums[j] == val) {
                    j--;
                    removedElementsCounter++;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                removedElementsCounter++;
            }
        }
        return nums.length - removedElementsCounter;
    }
}
