class Solution {

    /*
    BRUTE FORCE APPROACH
    */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    } 
    /*
    TIME COMPLEXITY : O(N + Nlogn)
    */
    
    /*
    OPTIMIZED SOLUTION (TWO POINTER adding pointers towards the end of array and comparing which element is greater)
    */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }
    /*
    TIME COMPLEXITY : O(N)
    */
}