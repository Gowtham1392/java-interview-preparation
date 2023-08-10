# Problem link -> https://leetcode.com/problems/median-of-two-sorted-arrays/
  
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int length = nums1Len + nums2Len;
        int[] result =new int[length];
        System.arraycopy(nums1, 0, result, 0, nums1Len);
        System.arraycopy(nums2, 0, result, nums1Len, nums2Len);
        Arrays.sort(result);
        if (length%2==0) return (float)(result[length/2-1] + result[length/2])/2;
        else return result[length/2];
    }
}
