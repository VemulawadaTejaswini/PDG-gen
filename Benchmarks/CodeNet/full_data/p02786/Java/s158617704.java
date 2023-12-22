import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long sum = 1;
        if(H==1) System.out.println(1);
        else{
            long num = 2;
            while(num<=H){
                sum+=num;
                num*=2;
            }
            System.out.println(sum);
        }
    }
}