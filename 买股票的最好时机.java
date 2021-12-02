// 你可以买入一次股票和卖出一次股票
// 并非每天都可以买入或卖出一次，总共只能买入和卖出一次
// 且买入必须在卖出的前面的某一天
import java.util.*;


public class Solution {
    /**
     *
     * @param prices int整型一维数组
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int len = prices.length;
        int min = prices[0];
        int maxdiff=0,currentdiff=0;
        for (int i=1;i<len;i++){
            if (prices[i]<min){
                min = prices[i];
            }
            currentdiff = prices[i]-min;
            if (currentdiff >maxdiff){
                maxdiff = currentdiff;
            }
        }
        return maxdiff;
    }
}
