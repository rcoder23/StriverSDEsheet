import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
         while(first==null && second==null)return first;
    if(first==null)return second;
    if(second==null)return first;
        LinkedListNode<Integer> p1=first;
        LinkedListNode<Integer> p2=second;
        LinkedListNode<Integer> ans=new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> res=ans;
        while(p1!=null && p2!=null){
            if(p1.data>p2.data){
               ans.next=new LinkedListNode<Integer>(p2.data);
                ans=ans.next;
//                 System.out.println("da"+" "+p2.data);
                p2=p2.next;
            }else{
                ans.next=new LinkedListNode<Integer>(p1.data);
                  ans=ans.next;
//                 System.out.println("da"+" "+p1.data);
                p1=p1.next; 
            }
        }
        
        while(p1!=null){
              ans.next=new LinkedListNode<Integer>(p1.data);
              ans=ans.next;
               p1=p1.next;
        }
        
        while(p2!=null){
            ans.next=new LinkedListNode<Integer>(p2.data);
              ans=ans.next;
                p2=p2.next;
        }

//         ans.next=new LinkedListNode<Integer>(-1);
        return res.next;
	}
}
