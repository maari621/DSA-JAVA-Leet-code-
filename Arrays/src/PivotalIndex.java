/**
 * LeetCode 724: Find Pivot Index
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all numbers strictly to the left equals the sum of all numbers strictly to the right.
 * Return the leftmost pivot index. If no such index exists, return -1.
 *
 * Approach: Calculate the total sum first, then iterate through the array. For each index, calculate rightSum as (total - leftSum - current element).
 * If leftSum equals rightSum, return the index.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class PivotalIndex {

    public int pivotIndex(int[] nums) {
        // STEP 1: Calculate total sum of all elements in the array
        // This represents the sum that we'll use to calculate rightSum for each position
        int max=0;
        for(int i=0;i<nums.length;i++){
            max+=nums[i];
        }

        // STEP 2: Initialize prefix sum variables
        // leftSum: sum of all elements to the left of current index
        // rightSum: sum of all elements to the right of current index
        int leftSum=0;
        int rightSum=0;

        // STEP 3: Iterate through each element to find the pivot index
        for(int i=0;i<nums.length;i++){
            // Calculate rightSum using the formula: rightSum = total - leftSum - current_element
            // This works because: leftSum + nums[i] + rightSum = total
            // Therefore: rightSum = total - leftSum - nums[i]
            rightSum = max-leftSum-nums[i];

            // If leftSum equals rightSum, we found the pivot index
            // The while loop here is actually redundant (should be if), but it checks the condition
            while(rightSum==leftSum){
                return i;  // Return the pivot index
            }

            // Move to next element: add current element to leftSum for next iteration
            // This ensures leftSum represents all elements before the next index
            leftSum+=nums[i];
        }

        // If no pivot index found after checking all elements, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test case: array {1,7,3,6,5,6}
        // At index 3 (value 6): leftSum = 1+7+3 = 11, rightSum = 5+6 = 11 ✓ PIVOT FOUND
        int[] arr = {1,7,3,6,5,6};
        PivotalIndex pivotalIndex = new PivotalIndex();
        int k = pivotalIndex.pivotIndex(arr);
        System.out.println(k);  // Output: 3
    }
}
