import java.io.*;
import java.util.*;
public class Main {
    static int dfs(ArrayList<Integer>list[],int idx,int par){
        int max = 0;
        int cnt = 0;
        for(int temp : list[idx]){
            if(temp == par)continue;
            int child = dfs(list,temp,idx);
            if(max == child)++cnt;
            if(max < child){
                max = child;
                cnt = 1;
            }
        }
        //System.out.println(max + cnt + " " + idx);
        return max + cnt;
    }
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer>list[] = new ArrayList[n + 1];
        for(int i = 1;i <= n;i++)
            list[i] = new ArrayList<>();
        for(int i = 2;i <= n;i++){
            int temp = Integer.parseInt(br.readLine());
            list[i].add(temp);
            list[temp].add(i);
        }
        System.out.println(dfs(list,1,-1));
    }
}