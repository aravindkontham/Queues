import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack();
        q.add(12);
        q.add(23);
        q.add(56);
        q.add(98);
        q.add(47);
        System.out.println("Queue:"+q);
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
      while(!st.isEmpty()){
          q.add(st.pop());
      }
        System.out.println("Reversed queue:" +q);
    }
}
