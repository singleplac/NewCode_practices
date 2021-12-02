public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
//         当前累加数<0,前面的抛弃，从下一个开始计算
//         当前累加数>0,
//                 当前累加<最大，最大=最大；
//                  当前累加>最大，最大= 累加
//         加入下一个数，更新最大和累加

        int len = array.length;
        if (len==0){
            return 0;
        }
        int sum = array[0];
        int max = array[0];
        for (int i=1;i<len;i++){   //start from 1
            if (sum <0){
                sum = array[i];
            }else{
                 sum = sum +array[i];
            }

            if (max <sum){
                max = sum;
            }
        }
        return max;
    }
}
