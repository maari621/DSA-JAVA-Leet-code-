

import java.util.Arrays;
import java.util.HashMap;

/**
 * LeetCode 1. Two Sum
 * This class provides a solution to find two numbers in an array that add up to a target value.
 */
public class TwoSum {

    /**
     * Finds two numbers in the array that add up to the target value.
     *
     * Time Complexity: O(n) - single pass through the array
     * Space Complexity: O(n) - for the HashMap storage
     *
     * Approach: Uses a HashMap to store numbers we've seen and their indices.
     * For each number, we check if its complement (target - current number) exists in the map.
     * If it does, we found our pair. If not, we add the current number to the map.
     *
     * @param nums the array of integers
     * @param target the target sum
     * @return an array containing the indices of the two numbers that add up to target
     */
    int[] twoSum(int[] nums, int target) {
        // HashMap to store number and its index
        // Key: number value, Value: index position in array
        HashMap<Integer, Integer> map = new HashMap();

        // Iterate through each element in the array
        for(int i = 0; i < nums.length; ++i) {
            // Calculate the complement needed to reach target
            // complement = target - current number
            int complement = target - nums[i];

            // Check if complement already exists in the map
            // If it does, we found our pair!
            if (map.containsKey(complement)) {
                // Return the indices: [index of complement, current index]
                return new int[]{(Integer)map.get(complement), i};
            }

            // If complement not found, store current number and its index
            // This will be used for future complement checks
            map.put(nums[i], i);
        }

        // No two numbers found that add up to target
        return null;
    }

    /**
     * Main method to test the twoSum function with sample input.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an instance of TwoSum
        TwoSum obj = new TwoSum();

        // Test array: [2, 7, 11, 15]
        int[] nums = new int[]{2, 7, 11, 15};

        // Target sum: 18
        // Expected: indices [1, 3] because nums[1]=7 and nums[3]=15, and 7+15=22 (or adjust target)
        int target = 18;

        // Call twoSum method and print the result as an array
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }
}
