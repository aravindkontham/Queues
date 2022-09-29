import java.util.Scanner;

public class Symmertic_pais {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=scan.nextInt();
            arr[i][1]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            int first1=arr[i][0];
            int second1=arr[i][1];
            for(int j=i+1;j<n;j++){
                int first2=arr[j][0];
                int second2=arr[j][1];
                if(first1==second2 && first2==second1){
                    System.out.println("Symmetric Pair:"+ first1+" "+second1);
                }
            }

        }
    }
}
