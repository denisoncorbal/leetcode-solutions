package br.com.dgc.problem_26_remove_duplicates_from_sorted_array;

public class Solution2 {

    // Solução complexidade O(n)
    // Solução inválida porque não é "in-place"

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;        
                
        int[] uniques = new int[nums.length];
        int j = 0;
        uniques[j] = nums[j++];
        int uniqueCounter = 1;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                uniqueCounter++;
                uniques[j++] = nums[i+1];                
            }
        }        
        System.arraycopy(uniques, 0, nums, 0, nums.length);
        return uniqueCounter;
    }
}
