import java.util.*;
public class Main {// Main
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        long[] arr = new long[a];
        for(int i=0;i<a;i++) {
            long el = s.nextLong();
            arr[i] = el;
        }

        long sum1 = 0;
        long sum2 = 0;

        for(int i=0;i<a;i++) {
            if(i % 2 == 0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }
        System.out.println(Math.max(sum1, sum2));
    }
}