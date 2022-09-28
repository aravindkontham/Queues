public class QuickSort {
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
    static int partition(int arr[],int low,int high){
        int i=(low-1);
        int pivot=arr[high];

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return(i+1);

    }
    static void quick(int arr[],int low, int high){
        if(low<high){
        int pi=partition(arr,low,high);
       quick(arr,low,pi-1);
       quick(arr,pi+1,high);
     }

    }
    static void print(int arr[],int low,int high){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[]={12,13,11,14,16,15,12};
        int n=arr.length;
        quick(arr,0,n-1);
        System.out.println("Sorted list");
        print(arr,0,n-1);
    }
}
