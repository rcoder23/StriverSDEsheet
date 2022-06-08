import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int slow=arr.get(0);
        int fast=arr.get(arr.get(0));
        while(slow!=fast){
            slow=arr.get(slow);
            fast=arr.get(arr.get(fast));
        }
       
        fast=0;
        while(fast!=slow){
           fast=arr.get(fast);
            slow=arr.get(slow);
        }
        return slow;
        
        
    }
}
