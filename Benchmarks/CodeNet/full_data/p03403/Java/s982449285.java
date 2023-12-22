import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeMap<Long,Integer> map = new TreeMap<Long,Integer>(Comparator.reverseOrder());
        int n = sc.nextInt();
        long[] al = new long[n+2];
        long[] ans = new long[n+1]; 
        long max = 0;
        for(int i = 1; i <= n+1; i++){
            if(i != n+1) al[i] = sc.nextLong();
            max += Math.abs(al[i]-al[i-1]);
        }
        for(int i = 1; i <= n; i++){
            System.out.println(max - Math.abs(al[i] - al[i-1]) - Math.abs(al[i+1] - al[i]) + Math.abs(al[i+1] - al[i-1]));
        }
    }
}