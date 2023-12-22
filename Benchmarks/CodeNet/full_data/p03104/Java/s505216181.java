import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long opt = A;
        long num = B-A;
        for(long a =1;a<=num;a++) opt = opt^(A+a);
        System.out.println(opt);
    }
}