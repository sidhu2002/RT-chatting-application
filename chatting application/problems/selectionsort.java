package problems;

public class selectionsort {
    public static void main(String[] args){

    int[] arr={5,9,2,1,7};
    int n =arr.length;
    for(int i=0;i<n-1;i++){
        int low=i;
        for(int j=i+1;j<n;j++){
            if(arr[low]>arr[j]){
                low=j;
            }
        }
        int temp=arr[low];
        arr[low]=arr[i];
        arr[i]=temp;


    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
}
}
    

