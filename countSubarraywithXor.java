import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int ans=0;
        int xor=0;
        for(int i=0;i<arr.size();i++){
            xor=xor^arr.get(i);
            if(map.containsKey(xor^x)){
                ans+=map.get(xor^x);
            }
            if(xor==x) ans++;
            if(map.get(xor)!=null){
                map.put(xor,map.get(xor)+1);
            }else
                map.put(xor,1);
        }
        return ans;
	}
}