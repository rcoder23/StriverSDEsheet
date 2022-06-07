import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0;
        int max=Integer.MIN_VALUE;
        while(j<input.length()){
            if(!map.containsKey(input.charAt(j))){
                map.put(input.charAt(j),1);
                j++;
            }else{
               while(map.size()>0 && map.containsKey(input.charAt(j))){
                   map.remove(input.charAt(i));
                   i++;
               }
                map.put(input.charAt(j),1);
//                 System.out.println(map);
                j++;
            }
            
            max=Math.max(j-i+1,max);
        }
        return max-1;
	}
}
