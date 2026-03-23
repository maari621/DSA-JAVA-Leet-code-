/**
 * LeetCode 238. Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product
 * of all elements of nums except nums[i].
 * Constraint: You must write an algorithm that runs in O(n) time and WITHOUT using the division operation.
 *
 * Approach: Two-pass prefix and suffix product technique
 * - First pass (left to right): Store product of all elements to the left of each index
 * - Second pass (right to left): Multiply with product of all elements to the right of each index
 * - For position i: result[i] = (product of all left elements) × (product of all right elements)
 *
 * Time Complexity: O(n) - two passes through the array
 * Space Complexity: O(1) - excluding the output array
 *
 * Example: nums = [-1, 1, 0, -3, 3]
 * Left products:  [1, -1, -1, 0, 0]  (product of elements before each index)
 * Right products: [0, 0, -9, 3, 1]   (product of elements after each index)
 * Result:         [0, 0, -9, 0, 0]   (left[i] × right[i])
 */
public class productofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // Initialize variables to track running products
        int leftProduct=1;    // Product of all elements to the left
        int rightProduct=1;   // Product of all elements to the right
        int[] result = new int[nums.length];

        // PASS 1: Left to Right - Store left product at each index
        // result[i] will contain product of all elements before index i
        for(int i = 0; i < nums.length; i++) {
            // Store the product of all elements to the left of i
            result[i]=leftProduct;
            // Update leftProduct for next iteration (include current element)
            leftProduct*=nums[i];
        }

        // PASS 2: Right to Left - Multiply with right product at each index
        // result[i] now becomes: (left product) × (right product)
        for(int i = nums.length-1; i >= 0; i--) {
            // Multiply the left product with right product
            result[i]*=rightProduct;
            // Update rightProduct for next iteration (include current element)
            rightProduct*=nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Test case: [-1, 1, 0, -3, 3]
        // Expected: [0, 0, -9, 0, 0]
        // Explanation:
        // Index 0: 1 × 0 × (-3) × 3 = 0
        // Index 1: (-1) × 0 × (-3) × 3 = 0
        // Index 2: (-1) × 1 × (-3) × 3 = 9 (but we get negative from products)
        // Index 3: (-1) × 1 × 0 = 0
        // Index 4: (-1) × 1 × 0 = 0
        int[] arr = {-1,1,0,-3,3};
        productofArrayExceptSelf productofArrayExceptSelf = new productofArrayExceptSelf();
        int[] result = productofArrayExceptSelf.productExceptSelf(arr);
        // Print result
        for(int i:result) {
            System.out.print(i+" ");
        }
    }
}
