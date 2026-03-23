/**
 * LeetCode 238. Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product
 * of all elements of nums except nums[i].
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Approach: Prefix and Suffix Product technique
 * - Create left array: left[i] = product of all elements to the left of i
 * - Create right array: right[i] = product of all elements to the right of i
 * - Result[i] = left[i] × right[i]
 * Alternative: Use O(1) space by computing suffix on the fly
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) for result array (not counting output)
 */
public class ProductOfArray {
    static int[] productExceptSelf(int[] nums) {
       return null;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = productExceptSelf(arr);
        for(int i:result) {
            System.out.print(i+" ");
        }
    }
}
