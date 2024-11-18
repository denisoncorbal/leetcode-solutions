package br.com.dgc.problem_26_remove_duplicates_from_sorted_array;

public class Solution3 {
    // Solução complexidade O(n) e "in-place"

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;        
                
        int j = 1;
        int uniqueCounter = 1;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                uniqueCounter++;
                nums[j++] = nums[i+1];                
            }
        }        
        return uniqueCounter;
    }
}
