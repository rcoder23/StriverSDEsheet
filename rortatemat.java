import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        
        if(m==1 || n==1) return;
        int k=0;
        
        while(k<n/2 && k<m/2){
            int i=k,j=k+1;
            while(j<=m-1-k){
                swap(mat,k,k,i,j);
                j++;
            }
            j--;
            i++;
            while(i<=n-1-k){

             swap(mat,k,k,i,j);
            i++;

        } 

        i--;

        j--;

        while(j>=k){
 swap(mat,k,k,i,j);
            j--;

        } 

        j++;

        i--;

        while(i>=k){

           swap(mat,k,k,i,j);

            i--;

        }

        k++;


        }
    }
    
    
    public static void swap(ArrayList<ArrayList<Integer>> mat,int k,int k1,int i,int j){
        int t=mat.get(k).get(k1);
        int r=mat.get(i).get(j);
        mat.get(k).set(k1,r);
        mat.get(i).set(j,t);
        return;
    }
}
