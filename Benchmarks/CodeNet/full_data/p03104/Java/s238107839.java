import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long num = (B-A+1)/2;
        long k;
        long opt =0;
        if((B-A+1)%2==1){
            if(num%2==1) k=1;
            else k =0;
            opt = k^B;
        }
        else{
            opt = B^A;
        }
        System.out.println(opt);
    }
}