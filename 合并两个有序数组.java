import java.util.*;
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int pos = m+n-1;
        int i = m-1;
        int j= n-1;
        while (i >=0 && j >=0){
            A[pos--] = A[i] > B[j] ? A[i--]:B[j--];
        }
        while (j>=0){
            A[pos--] = B[j--];
        }

    }
}
