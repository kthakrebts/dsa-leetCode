import java.util.HashMap;

class MajorityElement {
    public static void main(String[] args){
        int nums[] = {3,2,3,2,2,3,1,1,3,3};
        System.out.print(majorityElements(nums));
    }

    public static int majorityElements(int[] nums){ 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int majorityCount = nums.length / 2;
        for(int key : map.keySet()){
            if(map.get(key) > majorityCount){
                return key;
            }
        }
        
        return -1; // Return -1 if no majority element exists
    }
}