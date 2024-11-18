package br.com.dgc.problem_169_majority_element;

public class Solution {
    // Complexity O(n)
    public int majorityElement(int[] nums) {
        mergeSort(nums, nums.length);
        int avg = nums.length / 2;
        boolean newNumber = true;
        int countEquals = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                countEquals++;
            }
            else{
                newNumber = false;
            }
            if(!newNumber){
                if(countEquals > avg){
                    return nums[i];
                }else{
                    newNumber = true;
                    countEquals = 1;
                }
            }
        }
        return nums[nums.length - 1];
    }

    public void mergeSort(int[] arr, int n){
        if(n<2){
            return;
        }
        int mid= n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i = 0; i<mid;i++){
            left[i] = arr[i]; 
        }
        for(int i= mid; i<n; i++){
            right[i-mid] = arr[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n-mid);
        mergeSortAll(arr, left, right, mid, n-mid);
    }

    public void mergeSortAll(int[] arr, int[] left, int[] right, int l, int r){
        int i = 0, j=0, k=0;
        while(i < l && j < r){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i < l){
            arr[k++] = left[i++];
        }
        while(j < r){
            arr[k++] = right[j++];
        }
    }
}
