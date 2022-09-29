import java.util.HashMap;
import java.util.Scanner;

public class SymmetricPairs {
    static void FindPairs(int arr[][],int n){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            int first1=arr[i][0];
            int second1=arr[i][1];
            Integer data=h.get(second1);
            if(data!=null && data==first1 )
                System.out.println(first1+" "+second1);
            else
               h.put(first1,second1);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=scan.nextInt();
        int arr[][]=new int[n][2];
        System.out.println("Enter the "+ n+" pairs");
        for(int i=0;i<n;i++){
            arr[i][0]= scan.nextInt();
            arr[i][1]= scan.nextInt();
        }
        FindPairs(arr,n);
    }
}