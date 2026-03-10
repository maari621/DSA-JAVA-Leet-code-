import java.util.HashMap;
import java.util.Map;

public class DuplicatesII{

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> arr = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(arr.containsKey(nums[i])){
                int pos = arr.get(nums[i]);
                int temp = Math.abs(pos-i);
                if(temp<=k){
                    return true;
                }
            }
            arr.put(nums[i],i);
        }
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
