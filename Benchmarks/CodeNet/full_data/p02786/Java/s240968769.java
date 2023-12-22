import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long  H = sc.nextLong();
        long num = 2;
        while(num<=H) num*=2;
        System.out.println(num-1);
    }
}