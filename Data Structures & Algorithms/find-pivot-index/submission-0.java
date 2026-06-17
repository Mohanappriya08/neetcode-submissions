class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int n : nums){
            sum+= n;
        }

        int leftSum = 0;
        int rightSum = sum;
        for(int i=0;i<nums.length;i++){
            rightSum-= nums[i];
            if(leftSum==rightSum) return i;
            else {
            leftSum+=nums[i];
            }
        }
        return -1;
    }
}