import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("TaskC.out");
        long n = sc.nextLong();
        long min = Long.MAX_VALUE;
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0 && n/i <= n){
                min = Math.min(min, (i-1) + (n/i - 1));
            }
        }
        System.out.println(min);
    }
}