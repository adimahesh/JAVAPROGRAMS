public class Revnum {
    static void revnum(int n){
        if(n%10==n){
            System.out.print(n);
            return ;
        }
        System.out.print(n%10);
         revnum(n/10);
       
    }


    public static void main(String[] args) {
        revnum(1234567);

    }
    
}
