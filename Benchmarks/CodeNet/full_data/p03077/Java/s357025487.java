import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long e = scanner.nextLong();
        long min = Math.min(a,Math.min(b, Math.min(c,Math.min(d,e))));
        System.out.println((long)(Math.ceil((double)n/min) + 4));
    }
}