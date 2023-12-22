import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        long N = sc.nextLong();
        long[] n = new long[5];
        n[0] = sc.nextLong();
        long max = 0;
        for(int i=1; i<5; i++){
            n[i] = sc.nextLong();
            if(n[i]!=n[i-1]){
                max = Math.max(max, n[i - 1] / n[i]);
            }
        }
        System.out.println(N / n[0] + 5 + max);
    }
}