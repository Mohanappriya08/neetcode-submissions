class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product =1;
        int nonZeroProduct =1;
        int noOfZeros =0;
        for(int n:nums){
          product *= n;
          if(n==0) noOfZeros += 1;
          else  nonZeroProduct *= n;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) result[i]= product/nums[i];
            else{
                if(noOfZeros>1){
                        result[i]= 0;
                }else{
                     result[i] = nonZeroProduct;
                }
            }
        }
        return result;
    }
}  
