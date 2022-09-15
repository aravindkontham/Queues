package Queues;

//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Main {
//
//    public static void main(String[] args) {
//	Queue<Integer> q=new LinkedList<>();
//    q.add(23);//
//    q.add(12);
//    q.add(15);
//    q.offer(10);//doesn't throw any exception if we add an element to a full queue;
//        System.out.println(q);
//        System.out.println(q.remove());//throws exception
//        q.poll();//wont throw xception
//        System.out.println(q);
//        System.out.println(q.peek());//return null if it is empty;
//        System.out.println(q.element());//throws exception:
//    }
//}
//import java.util.*;
//
//public class Main {
//    public static void main(String args[]) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0)
//            queue.add(s.nextInt());
//        printFifthElementFromStart(queue);
//    }
//
//    // Method to print the fifth element from the head of the queue
//    static void printFifthElementFromStart(Queue<Integer> queue) {
//        // Write your code here
//        if(queue.size()<5){
//            System.out.println("There are not enough elements in the queue");
//        }
//        else{
//            for(int i=0;i<queue.size()-4;i++){
//                queue.poll();
//            }
//        }
//        System.out.println(queue.peek());
//
//    }
//}
import java.util.*;

public class Main {

    /*implementing queue using linked list */
    Queue < Integer > q = new LinkedList < Integer > ();

    /* Push operation of stack using queue*/
    void push(int x) {
        int s=q.size();
        q.add(x);
        for(int i=0;i<x;i++){
            q.add(q.poll());
        }

    }

    /*Removes the top element of the stack*/

    int pop() {
        //write your code here
        if(q.isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        }
        return q.remove();

    }


    /*Returns the element at the top of the stack */
    int top() {
        //write your code here
        return q.peek();
    }


    public static void main(String[] args) {
        Main obj = new Main();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */

        int n = in .nextInt();

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push( in .nextInt());
        }

        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());
    }
}