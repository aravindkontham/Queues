import java.util.Scanner;
class LinearSerach{
    public static void main(String[] args) {
        int arr[]={6 ,8, 3, 5 ,9,1,2};
        int key=9;
        int loc=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==key){
                loc=arr.length-1-i;
                break;
            }
        }
        if(loc!=-1)
            System.out.println(loc);
        else
            System.out.println("Not found:");

    }


}

