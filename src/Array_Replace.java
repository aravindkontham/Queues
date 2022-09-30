import java.util.Scanner;

public class Array_Replace {
    public static void main(String[] args) {
        int arr1[]={2,7,8,6,13};
        int arr2[]={8, 4, 5};
        Find(arr1,arr2);
    }
    static void Find(int ar[],int arr[]){
        int reverse=0;
        int data=0;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i+1]<ar[i]){
                reverse=i+1;
                data=ar[i];
            }
        }
        Reverse(ar,arr,reverse,data);
    }
    static void Reverse(int ar[], int arr[],int r, int d){
        int loc=-1;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>d && arr[i]<=ar[r+1]){
               ar[r]=arr[i];
               loc=arr[i];
               break;
           }
        }
        if(loc!=-1)
            System.out.println("Swapped element from array 2 is:"+loc);
        else
            System.out.println("Not possible");

    }
}
