class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> count = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            count.add(nums[i]);
            if(i+1==count.size()) continue;
            else 
              return true;
        }
        return false;
    }
}