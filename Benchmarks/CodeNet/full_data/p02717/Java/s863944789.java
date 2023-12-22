import java.util.*;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long k = sc.nextLong();
            long mod = n%k;
            long diff = k-mod;
            System.out.println(mod<diff ? mod : diff);
        }
    }