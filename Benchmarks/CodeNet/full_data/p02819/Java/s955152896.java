import java.io.*;
import java.util.*;

public class Main{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int X = sc.nextInt(), ans = -1;
        int maxN = Math.min(20*X,1000000);
        boolean[] visited = new boolean[maxN+1];
        for(int i=2;i<=maxN;++i){
            if(visited[i]) continue;
            if(i>=X) {
                ans = i;
                break;
            }
            for(int j=2*i; j<=maxN; j+=i) visited[j] = true;
        }
        System.out.println(ans);
    }
}

