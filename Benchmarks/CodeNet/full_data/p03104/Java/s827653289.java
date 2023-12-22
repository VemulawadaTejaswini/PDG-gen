import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long t=sc.nextLong();
    long sum=0;
        for (long i = s; i < t+1; i++) {
           // System.out.println(i);
            sum=sum^i;
        }
        System.out.println(sum);
    }
    
}