import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bs = new int[n-1];

        for(int i = 0; i < bs.length; i++)
        	bs[i] = sc.nextInt();
        	
        int sum = 0;
        for(int i = 1; i < bs.length; i++) {
        	sum += Math.min(bs[i], bs[i-1]);
        }
        sum += bs[0];
        sum += bs[n-2];
        System.out.println(sum);
    }
}
