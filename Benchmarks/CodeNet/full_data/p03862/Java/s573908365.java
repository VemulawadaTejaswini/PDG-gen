import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long x = Long.parseLong(sc.next());
        long[] candies = new long[n];
        for(int i=0;i<n;i++){
            candies[i] = Long.parseLong(sc.next());
        }
        long cnt = 0;
        for(int i=0;i<n-1;i++){
            long sum = candies[i] + candies[i+1];
            if(sum<=x){
                continue;
            }else{
                long surplus = sum - x;
                cnt+=surplus;
                candies[i+1] = Math.max(0, candies[i+1]-surplus);
            }
        }
        System.out.println(cnt);
    }
}