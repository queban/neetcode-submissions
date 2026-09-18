class Solution {
    public int maxProfit(int[] prices) {
        int p = prices.length;
        int res =0; 
        for (int i = 0; i < p; i++){ // i pointer starts at 0 outter loop
            int buy = prices[i]; // sees the buying price of the array is 1 and the lowest
            for (int j = i + 1; j < p; j++){  // j pointer starts at 1 inner loop
                int sell = prices[j]; // sell if gonna be the price highest
                res = Math.max(res, sell - buy); // result is the difference you get when you sell vs when you bought.
            }
        }
        return res;
    }
}
