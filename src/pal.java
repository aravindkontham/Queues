import java.util.Scanner;
import java.util.Stack;

public class pal {
    static int check(char[] arr){
        Stack<Character> st=new Stack<>();
        Stack<Character> sn=new Stack<>();
        for (int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        System.out.println("st:"+st);
        for (int j=arr.length-1;j>=0;j--){
            sn.push(arr[j]);
        }
        System.out.println("sn:"+sn);
        if(st.equals(sn))
            return 1;
        return -1;

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scan.nextLine();
         char[] arr=str.toCharArray();
        //System.out.println(arr);
        int res=check(arr);
        //System.out.println(check(arr));
        if(res==1)
            System.out.println("Palindromic:");
        else
            System.out.println("Not a palindromic ");


    }
}