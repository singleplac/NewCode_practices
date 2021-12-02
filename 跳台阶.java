/**
*简化版题目： 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
*规律： method[n]=method[n-1]+method[n-2];
*题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
*规律：method[n]=method[n-1]+method[n-2]+...+method[1]+method[1]+1;
*/
public class Solution {
    public int jumpFloor(int target) {
           int times=0;
        if (target == 0){
            times =  0;
        }else if (target ==1){
            times = 1;
        }else{
            int x=0;
            for (int i=1;i<target;i++){
                x +=jumpFloor(i);
            }
            times = x+1;
        }
        return times;
    }
}
