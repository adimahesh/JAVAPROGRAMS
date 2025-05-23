public class revll {

 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode rev = new ListNode();
        rev = null;
        ListNode temp = head;
         while(temp!=null){
             if(rev == null){
                ListNode x = new ListNode(temp.val);
                rev = x;
             }
             else{
                 ListNode x = new ListNode(temp.val);
                x.next = rev;
                rev = x;
             }
             temp = temp.next;
         }
        
     return rev;    }
}
}
