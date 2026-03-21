public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int size = height.length-1;
        int left=0, right=height.length-1;
        int max =0;
        int leftHeighest = height[left];
        int rightHeighest = height[right];
        while(left<=right){
            int minHeight = Math.min(leftHeighest,rightHeighest);
            int capacity = minHeight*size;
            if(capacity > max){
                max=capacity;
            }
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
