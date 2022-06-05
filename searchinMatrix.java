import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
        int j=n-1;
        int i=0;
        while(i<mat.size()){
            if(mat.get(i).get(j)==target) return true;
            else if(mat.get(i).get(j)<target) i++;
            else{
                while(j>=0){
                    if(mat.get(i).get(j)==target) return true;
                    else j--;
                }
                return false;
            }
        }
        return false;
	}
}
