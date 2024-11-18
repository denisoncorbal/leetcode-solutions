package br.com.dgc.problem_80_remove_duplicates_from_sorted_array_ii;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;

        int j = 1;
        int uniqueCounter = 1;
        int countEquals = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                countEquals = 0;
                uniqueCounter++;
                nums[j++] = nums[i + 1];
            }
            else{
                countEquals++;
                if(countEquals < 2){
                    uniqueCounter++;
                    nums[j++] = nums[i + 1];
                }
            }            
        }
        return uniqueCounter;
    }
}
