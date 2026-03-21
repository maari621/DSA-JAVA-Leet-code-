/**
 * LeetCode 2461: Maximum Sum of Distinct Subarrays With Length K
 * Given an array of integers nums and an integer k, find the maximum sum of a subarray of length k where all elements are distinct.
 * If no such subarray exists, return 0.
 *
 * Approach: Use a sliding window with a HashSet to ensure distinct elements. Maintain a window of size up to k, but only consider when exactly k distinct.
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */
import java.util.HashSet;
import java.util.Set;

public class MaximunSumOfDistinctInSubArray {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum=0;
        long sum=0;
        boolean flag=false;
        Set<Integer> set=new HashSet<>();
        int left=0,right=0;
        for(right=0;right<nums.length;right++){
             while(set.contains(nums[right]) || set.size()==3){
                 set.remove(nums[left]);
                 sum=sum-nums[left];
                 left++;
             }
             sum+=nums[right];
             set.add(nums[right]);
             if(set.size()==k){
                 maxSum=Math.max(maxSum,sum);
             }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,7,8,9};
        int k=3;
        MaximunSumOfDistinctInSubArray maximunSumOfDistinctInSubArray = new MaximunSumOfDistinctInSubArray();
        long l = maximunSumOfDistinctInSubArray.maximumSubarraySum(arr, k);
        System.out.println(l);
    }
}
