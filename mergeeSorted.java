import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        for(int i=0;i<arr2.length;i++){
            arr1[m++]=arr2[i];
        }
        
        Arrays.sort(arr1);
        return arr1;
    }
}
