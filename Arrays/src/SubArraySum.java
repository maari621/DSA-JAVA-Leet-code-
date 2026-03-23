public class SubArraySum {

    public int subarraySum(int[] nums, int k) {

        int leftSum=0;
        int size=0;

        for(int i=0;i<nums.length;i++){
            int j=i;
            while(leftSum!=k & j<nums.length){
                leftSum+=nums[j];
                j++;
            }
            if(leftSum==k){
                size++;
            }
            leftSum=0;
        }
        return size;

    }

    public static void main(String[] args) {
        int[] arr = {1};
        int k=0;
        SubArraySum subArraySum = new SubArraySum();
        int i = subArraySum.subarraySum(arr, k);
        System.out.println(i);
    }
}
