import java.util.Scanner;

public class Fibonacci {
    int finds(int n){
        if(n<2)
            return n;
        else
            return (finds(n-1)+ finds(n-2));
    }
    public static void main(String[] args) {
     Fibonacci fb=new Fibonacci();
     Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sequence number to find fibonacci");
     int n=scan.nextInt();
     //fb.finds(n);
        System.out.println(  "Fibonacci number related to  "+n+" is " +fb.finds(n));

    }
}
