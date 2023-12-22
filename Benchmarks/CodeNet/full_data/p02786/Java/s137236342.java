import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(mon(n));
        sc.close();
    }
    public static long mon(long a){
        if(a == 1) return 1;
        return 2 * mon(a / 2) + 1;
    }
}