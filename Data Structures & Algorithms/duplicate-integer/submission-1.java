class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int num:nums){
            if(count.get(num)!=null){ 
                return true;
            }
            else count.put(num,1);
        } 
        return false;
    }
}