import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param arr int一维数组
     * @param k int
     * @return int
     */
    public int foundOnceNumber (int[] arr, int k) {
        // write code here
        //Java 位运算与（&）、非（~）、或（|）、异或（^）
        //异或 ^：相同为0，不同为1
        // a ^ 0 = a
        int res = 0;
        //若k是偶数  m ^ a ^ a  = m ^0 = m
        if((k&1)==0){
            for (int a :arr){
                res ^=a;
            }
            return res;
        }
        //若k是奇数
        //HashMap中经常用到containsKey()来判断键(key)是否存在
        Map<Integer, Boolean> dict = new HashMap(16);
        for (int a:arr){
            if(dict.containsKey(a)){
                dict.put(a,false);
            }else{
                dict.put(a,true);
            }
        }
//         HashMap遍历方法一：
//         for (Map.Entry entry: dict.entrySet()){
//             if((boolean)entry.getValue()){
//                 return (int)entry.getKey();
//             }
//         }
//
//         for (Map.Entry<Integer,Boolean> entry: dict.entrySet()){
//             if(entry.getValue()){
//                 return entry.getKey();
//             }
//         }
//      HashMap遍历方法二：
//      Map.get() 方法返回指定键所映射的值
        for (int num :dict.keySet()){
            if(dict.get(num) ==true) return num;
        }
        return 0;
    }
}
