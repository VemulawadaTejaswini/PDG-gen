import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static class edge {
        int from, to, cost;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        edge es[] = new edge[m];
        for(int i=0; i<m; i++){
            edge e = new edge();
            s = br.readLine().split(" ");
            e.from = Integer.parseInt(s[0]);
            e.to = Integer.parseInt(s[1]);
            e.cost = Integer.parseInt(s[2]);
            es[i] = e;
        }

        long score[] = new long[n+1];
        score[0] = 0;
        score[1] = 0;
        for(int i=2; i<n+1; i++) score[i] = Long.MIN_VALUE;

        for(int step=0; step<n; step++){
            for(int i=0; i<m; i++){
                edge e = es[i];
                if(score[e.from] + e.cost > score[e.to]) {
                    score[e.to] = score[e.from] + e.cost;
                }
            }
        }

        boolean inf_area[] = new boolean[n+1];
        Arrays.fill(inf_area, false);
        for(int step=0; step<n; step++){
            for(int i=0; i<m; i++){
                edge e = es[i];
                if(score[e.from] + e.cost > score[e.to]) {
                    score[e.to] = score[e.from] + e.cost;
                    inf_area[e.to] = true;
                }
            }
        }
        if(inf_area[n]){
            System.out.println("inf");
        } else {
            System.out.println(score[n]);
        }
    }
}