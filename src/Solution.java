import java.util.ArrayDeque;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

class Solution {
    public int[] reversePrint(ListNode head) {
        ArrayDeque<Integer> que = new ArrayDeque<>();
        if(head == null){
            return new int[0];
        }
        while (head.next != null){
            que.push(head.val);
            head = head.next;
        }
        que.push(head.val);
        int len = que.size();
        int[] n = new int[len];
        for(int i = 0; i < len; i++){
            n[i] = que.pop();
        }
        return n;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        int[] ints = s.reversePrint(head);
        System.out.println("ints = " + ints);
    }
}