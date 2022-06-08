// import for 'Comparator'
import java.util.*;

public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        int count=0;        
        int k=0 ;
        
        
//loop to count the no. of rows in returning 2D-Array
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == s)
                {
                    count++;
                }
            }
        }
        
        
//initialise result array
        int[][] ans = new int[count][2];
        
        
// loop for storing answer pairs in 2D array
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == s)
                {
                    if(arr[i] < arr[j])
                    {
                        ans[k][0] = arr[i];
                        ans[k][1] = arr[j];
                    }
                    else
                    {
                        ans[k][0] = arr[j];
                        ans[k][1] = arr[i];
                    }
                    k++;
                }
            }
        }
        
        
// Sorting resulting 2D array
        Arrays.sort(ans, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        });
        
        return ans;
    }
}