import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long opt = A;
        for(long a =A+1;a<=B;a++) opt = opt^a;
        System.out.println(opt);
    }
}