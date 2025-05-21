import java.util.Scanner;

public class Bubblesrt {
    public static void main(String[] args) {
       int x;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 10 random numbers");

        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<10-i-1;j++){
                if(arr[j]>arr[j+1]){
               x=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=x;
                }
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
