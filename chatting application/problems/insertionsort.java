package problems;

public class insertionsort {
    public static void main(String[] args){
        int[] arr={9,2,8,3,7,4};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while( j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            
            arr[j+1]=current;
            
            

        }
        for (int i: arr){
            System.out.print(arr[i]);
        }
    }
    
}
