package br.com.dgc.problem_88_merge_sorted_array;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i<= (m+n-1); i++){
            nums1[i]=nums2[i-m];
        }
        mergeSort(nums1, m+n);
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
