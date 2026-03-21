/**
 * LeetCode 26. Remove Duplicates from Sorted Array
 *
 * Problem: Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. The relative order of the elements should be kept
 * the same. Then return the number of unique elements in nums.
 *
 * Approach: Two-pointer technique
 * - Use two pointers: i (fast pointer) to iterate through array, j (slow pointer) to track unique elements
 * - When nums[i] != nums[j], we found a new unique element, increment j and copy nums[i] to nums[j]
 * - Return j+1 as the count of unique elements
 *
 * Time Complexity: O(n) - single pass through the array
 * Space Complexity: O(1) - in-place modification, no extra space used
 */
public class RemoveDuplicateInSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5};
        RemoveDuplicateInSortedArray removeDuplicateInSortedArray = new RemoveDuplicateInSortedArray();
        int k = removeDuplicateInSortedArray.removeDuplicates(arr);
        for(int i=0;i<k;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
