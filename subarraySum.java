import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        
        long max=0;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
             max=Math.max(max,sum);
            if(sum<0) sum=0;

        }
        if(sum>max) max=sum;
//         System.out.println(sum);
        return max;
	}

}
