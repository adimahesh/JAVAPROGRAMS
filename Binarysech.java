public class Binarysech {
    public static void main(String[] args) {
        int arr[]={10, 20, 25, 57, 63, 96};
         int start=0;
         int flag=1;
         int end = arr.length-1;
         int mid = start+(end-start)/2;
         int val=20;
         while(start<=end){
          if(val==arr[mid]){
            flag = 0;
            System.out.println(mid);
            break;
          }
          else if(val>arr[mid]){
            start=mid+1;
          }
          else{
            end=mid-1;
          }
          mid=(start+end)/2;
         } 
         if(flag==1){
          System.out.println("element is not there");
         }  
    }
}
