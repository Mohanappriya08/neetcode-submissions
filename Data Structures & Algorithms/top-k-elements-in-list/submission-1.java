class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        int[] top = new int[k];
        //frequency loop
        for(int i=0;i<nums.length+1;i++){
                bucket[i] = new ArrayList<>();
                for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
                    if(i==entry.getValue()) bucket[i].add(entry.getKey());
                }
                System.out.println(bucket[i]);
        }
        int index =0;
        for(int no = nums.length;no >=0;no--){
            if(bucket[no].size()>0){
            for(Integer n:bucket[no]){
                top[index] = n;
                if(index==k-1) return top;
                index++;
            }
            }
        }
        return top;
    }
}
