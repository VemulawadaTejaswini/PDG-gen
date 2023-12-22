import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min = Long.MAX_VALUE;
        for(int i = 1; i<=100000; i++) {
            if(n%i==0) min = Math.min((long)Math.max(Math.log10(n/i)+1,Math.log10(i)+1),min);
        }
        System.out.println(min);
    }
}