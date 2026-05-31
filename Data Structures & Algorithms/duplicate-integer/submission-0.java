class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int num:nums){
            int value = (count.get(num)!=null)?count.get(num):0;
            if(value>0){ 
                count.put(num,value+=1);
                return true;
            }
            else count.put(num,1);
        } 
        return false;
    }
}