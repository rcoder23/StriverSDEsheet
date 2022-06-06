import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        
        int maxProfit=0;
        int currmin=Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            currmin=Math.min(currmin,prices.get(i));
            int profit=prices.get(i)-currmin;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}