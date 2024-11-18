package br.com.dgc.problem_26_remove_duplicates_from_sorted_array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicatesCounter = 0;
        int lastAvaliable = nums.length - 1;
        for(int i = 0; i <= lastAvaliable - 1; i++){
            if(nums[i] == nums[i+1]){
                duplicatesCounter++;
                moveToLast(nums, i+1, duplicatesCounter, lastAvaliable);
                if(i+1 != lastAvaliable){
                    i--;
                }                
                lastAvaliable--;
            }
        }
        return nums.length - duplicatesCounter;
    }

    public void moveToLast(int[] nums, int pos, int n, int last){
        for(int i = pos; i<=last-1; i++){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
    }
}
