import java.util.Scanner;
import java.util.Stack;

public class pal {

    static void Check(String n){
        Stack<Character> st=new Stack<Character>();
        Stack<Character> sn=new Stack<Character>();
        char [] arr=n.toCharArray();

        if(arr.length!=0)
            for(int i=0;i<arr.length;i++){
                st.push(arr[i]);
            }


        for(int j=arr.length-1;j>=0;j--){
            sn.push(arr[j]);
        }

        System.out.println(st);
        System.out.println(sn);

        if(st.equals(sn)){
            System.out.println("it is a palindrome number");

        }

        else{
            System.out.println("it's not a palindrome number");

        }



    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scan.nextLine();


        Check(str);
    }
}