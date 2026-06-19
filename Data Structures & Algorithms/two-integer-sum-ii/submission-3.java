class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start =0;
        while(start<=numbers.length-2){
            for(int i=start+1;i<numbers.length;i++){
                if(numbers[start]+numbers[i]==target) {
                    System.out.println(start+1);
                    System.out.println(start+i+1);
                    return new int[]{start+1,i+1};
                    }
                else continue;
            }
            start+=1;
            
        }
        return new int[]{1,2};
    }
}
