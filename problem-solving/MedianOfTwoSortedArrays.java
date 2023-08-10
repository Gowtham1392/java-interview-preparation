# Problem link -> https://leetcode.com/problems/median-of-two-sorted-arrays/

# Runtime is 27ms which is not very optimal - Need to optimize the code
  
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int resultLen = nums1Len + nums2Len;
        int[] result =new int[resultLen];
        System.arraycopy(nums1, 0, result, 0, nums1Len);
        System.arraycopy(nums2, 0, result, nums1Len, nums2Len);
        Arrays.sort(result);
        if(resultLen % 2 == 1){
            return result[resultLen/2];
        }
        else{
            double num1 = result[(resultLen / 2) - 1];
            double num2 = result[resultLen / 2];
            double op = (num1 + num2) / 2;
            return Double.parseDouble(String.format("%.3f", op));
        }
    }
}
