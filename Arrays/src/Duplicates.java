import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 217. Contains Duplicate
 * This class provides a solution to determine if an array contains duplicate elements.
 */
public class Duplicates {

    /**
     * Checks if the given array contains any duplicate elements.
     *
     * Time Complexity: O(n) - where n is the length of the array
     * Space Complexity: O(n) - for the HashSet storage
     *
     * @param nums the array to check for duplicates
     * @return true if duplicates exist, false otherwise
     */
    boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique numbers
        Set<Integer> data = new HashSet<>();

        // Iterate through each element in the array
        for(int i=0;i<nums.length;i++){
            // If the current element is already in the set, we found a duplicate
            if(data.contains(nums[i])){
                return true;
            }
            // Add the current element to the set
            data.add(nums[i]);
        }

        // No duplicates found
        return false;
    }

    /**
     * Main method to test the containsDuplicate function.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Test array with duplicate elements: 1, 2, 3 appear twice
        int[] nums = {1,2,3,1,2,3};

        // Create an instance of the Duplicates class
        Duplicates duplicates = new Duplicates();

        // Call the containsDuplicate method and store the result
        boolean b = duplicates.containsDuplicate(nums);

        // Print the result (true means duplicates exist)
        System.out.println(b);

    }
}
