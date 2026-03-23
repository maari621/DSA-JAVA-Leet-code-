/**
 * LeetCode 11. Container With Most Water
 * Given an integer array height of length n, find two lines that together with the x-axis form
 * a container, such that the container contains the most water.
 *
 * Approach: Two-pointer technique
 * - Start with pointers at both ends (maximum width)
 * - Area = width × min(left_height, right_height)
 * - Always move the pointer pointing to the smaller height (greedy approach)
 * - This is optimal because moving the taller pointer will only decrease area
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        // Initialize width as the distance between first and last element
        int size = height.length-1;
        // Initialize two pointers at the extremes
        int left=0, right=height.length-1;
        // Track maximum area found so far
        int max =0;
        // Store heights at current pointers
        int leftHeighest = height[left];
        int rightHeighest = height[right];

        // Continue until pointers meet
        while(left<=right){
            // Calculate area: width × minimum height
            int minHeight = Math.min(leftHeighest,rightHeighest);
            int capacity = minHeight*size;

            // Update max if current area is larger
            if(capacity > max){
                max=capacity;
            }

            // Move the pointer with smaller height inward (greedy strategy)
            // This is because area is limited by the shorter height
            if(leftHeighest<rightHeighest){
                leftHeighest=height[left+1];
                size--;
                left=left+1;
            }
            else if(rightHeighest<leftHeighest){
                rightHeighest=height[right-1];
                size--;
                right=right-1;
            }
            else {
                // If heights are equal, both pointers will give same result moving either way
                return max;
            }


        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,3,2,5,25,24,5};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int maxArea = containerWithMostWater.maxArea(height);
        System.out.println(maxArea);
    }
}
