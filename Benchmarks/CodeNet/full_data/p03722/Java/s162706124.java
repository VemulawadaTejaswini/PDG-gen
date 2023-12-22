import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static class edge{
        ArrayList<Integer> to;
        ArrayList<Long> cost;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        edge[] edge_list = new edge[n];
        for(int i=0; i<n; i++){
            edge_list[i] = new edge();
            edge_list[i].to = new ArrayList<Integer>();
            edge_list[i].cost = new ArrayList<Long>();
        }

        for(int i=0; i<m; i++){
            str = br.readLine().split(" ");
            int from = Integer.parseInt(str[0]) - 1;
            edge_list[from].to.add(Integer.parseInt(str[1]) - 1);
            edge_list[from].cost.add(Long.parseLong(str[2]));
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MIN_VALUE/2);
        dist[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<edge_list[i].to.size(); j++){
                dist[edge_list[i].to.get(j)]
                        = Long.max(dist[edge_list[i].to.get(j)], dist[i] + edge_list[i].cost.get(j));
            }
        }

        long tmp = dist[n-1];

        for(int i=0; i<n; i++){
            for(int j=0; j<edge_list[i].to.size(); j++){
                dist[edge_list[i].to.get(j)]
                        = Long.max(dist[edge_list[i].to.get(j)], dist[i] + edge_list[i].cost.get(j));
            }
        }

        if(tmp < dist[n-1]) System.out.println("inf");
        else System.out.println(tmp);
    }
}