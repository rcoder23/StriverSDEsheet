import java.util.HashSet;
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2=new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    set1.add(i);
                    set2.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(set1.contains(i) || set2.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }

}