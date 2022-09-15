
import java.util.HashMap;
import java.util.Scanner;

public class sub_array {
    static int maxlen(int arr[]){
        HashMap<Integer,Integer> HM=new HashMap<Integer,Integer>();
        int sum=0;
        int max_len=0;
        for(int i=0;i<arr.length;i++){
            sum= arr[i];
            if(arr[i]==0 && max_len==0)
                max_len=1;
            if(sum==1)
                max_len=i+1;
            Integer prev_i =HM.get(sum);

            if(prev_i!=null)
                max_len=Math.max(max_len,i-prev_i);
            else
                HM.put(sum,i);

        }
        return max_len;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int  n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        int j;
        for (j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        maxlen(arr);
        int count;


    }
}