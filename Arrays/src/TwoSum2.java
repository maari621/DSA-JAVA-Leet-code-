
/**
 * LeetCode Problem 167: Two Sum II - Input Array Is Sorted
 *
 * Problem: Given a 1-indexed array of integers sorted in non-decreasing order,
 * find two numbers that add up to a specific target number.
 * Return the indices of the two numbers (1-indexed).
 *
 * Approach: Two-pointer technique
 * - Start with one pointer at the beginning (i=0) and one at the end (j=length-1)
 * - If sum equals target, return the indices (1-indexed)
 * - If sum is greater than target, move right pointer left to decrease sum
 * - If sum is less than target, move left pointer right to increase sum
 *
 * Time Complexity: O(n) - single pass through the array
 * Space Complexity: O(1) - only using two pointers
 */

public class TwoSum2 {

    static int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;

        while(i!=j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }
            else if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbers,target);
        System.out.println(result[0]+","+result[1]);
    }
}
