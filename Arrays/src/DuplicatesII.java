/**
 * LeetCode 219. Contains Duplicate II
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j
 * in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Approach: HashMap to store the most recent index of each number
 * - For each number, check if it exists in the map and if the distance is <= k
 * - Update the map with the latest index of the number
 * - This ensures we always check the most recent occurrence
 *
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, k)) - HashMap stores at most k unique elements
 */
import java.util.HashMap;
import java.util.Map;

public class DuplicatesII{

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap to store number -> most recent index mapping
        Map<Integer,Integer> arr = new HashMap<Integer,Integer>();

        // Iterate through the array
        for(int i=0;i<nums.length;i++){
            // Check if current number has been seen before
            if(arr.containsKey(nums[i])){
                // Get the previous index where this number appeared
                int pos = arr.get(nums[i]);
                // Calculate the distance between indices
                int temp = Math.abs(pos-i);
                // If distance is <= k, we found our answer
                if(temp<=k){
                    return true;
                }
            }
            // Update the map with the current number and its latest index
            arr.put(nums[i],i);
        }
        // No valid duplicate pair found
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k=2;
        DuplicatesII duplicatesII = new DuplicatesII();
        boolean b = duplicatesII.containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }
}
