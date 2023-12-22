import java.io.*;
import java.util.*;

/**
 * Created by vikas.k on 27/12/16.
 */
public class Main {
    public static void main(String[] args){
        Main gv = new Main();
        gv.solve();
    }

    private List<List<Integer>> str;
    private int[] dist;
    private int n,k;

    private void solve(){
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        n = sc.nextInt();
        k = sc.nextInt();

        str = new ArrayList<>(n);
        for(int i=0 ;i<n;i++){
            str.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            str.get(x-1).add(y-1);
            str.get(y-1).add(x-1);
        }

        out.println(doCal());
        out.close();
    }

    private int doCal(){
        dist = new int[n];
        int ret = Integer.MAX_VALUE;
        if(k%2 == 0) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(dist, Integer.MAX_VALUE);
                doBFS(i);
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (dist[j] > k/2) cnt++;
                }
                ret = Math.min(cnt, ret);
            }
        }else{
            int[] dist2 = new int[n];
            for(int i=0;i<n;i++){
                for(int j:str.get(i)){
                    Arrays.fill(dist, Integer.MAX_VALUE);
                    doBFS(i);
                    dist2 = dist;
                    Arrays.fill(dist, Integer.MAX_VALUE);
                    doBFS(j);
                    int cnt =0;
                    for (int g = 0; g < n; g++) {
                        if (Math.min(dist[g],dist2[g]) > k/2) cnt++;
                    }
                    ret = Math.min(cnt, ret);
                }
            }
        }
        return ret;
    }

    private void doBFS(int v){
        Queue<Integer> tmp = new LinkedList<>();
        dist[v] = 0;
        tmp.add(v);

        while(tmp.size() > 0){
            int u = tmp.poll();

            for(int i:str.get(u)){
                if(dist[i] == Integer.MAX_VALUE || dist[i] > dist[u]+1){
                    dist[i] = dist[u]+1;
                    tmp.add(i);
                }
            }
        }
    }

    public static PrintWriter out;

    private static class MyScanner{
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private MyScanner(){
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next(){
            if(stringTokenizer == null || !stringTokenizer.hasMoreElements()){
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt(){
            return Integer.parseInt(next());
        }
        private String nextLine(){
            String ret= "";
            try {
                ret= bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }
}
