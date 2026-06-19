class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int minPrice = prices[0];
        int maxProfit =0;
        for(int i=1; i<prices.length; i++){
            maxProfit = Math.max(maxProfit,prices[i]- minPrice);
            minPrice = Math.min(prices[i],minPrice);
            System.out.println(minPrice);
            System.out.println(maxProfit);
        }
        return maxProfit;
    }
}
