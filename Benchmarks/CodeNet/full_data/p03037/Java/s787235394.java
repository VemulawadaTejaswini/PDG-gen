import java.io.*;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] buf = reader.readLine().split(" ");
        int n = Integer.parseInt(buf[0]), m = Integer.parseInt(buf[1]);
        int[] rec = new int[n+2];
        for(int i=0;i<m;i++){
            buf = reader.readLine().split(" ");
            int le = Integer.parseInt(buf[0]), ri = Integer.parseInt(buf[1]);
            rec[le]++; rec[ri+1]--;
        }
        int sum = 0, ans = 0;
        for(int i=1;i<=n;i++){
            sum += rec[i];
            if(sum==m) ans ++;
        }
        System.out.println(ans);
    }
}

