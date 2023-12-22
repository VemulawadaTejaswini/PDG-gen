import java.util.*;

public class Main{
    static int[][] al;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final int MOD = (int)1e9+7;
        
        int n = Integer.parseInt(sc.next());
        al = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(al[i], -1);
        }
        
        boolean[] used = new boolean[n];
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        
        for(int i=0; i<n; i++){
            Arrays.fill(used,false);
            q.add(i);
            used[i] = true;
            while(q.size()!=0){
                int now = q.poll();
                for(int j=0; j<n; j++){
                    if(!used[j]){
                        al[now][j] = i;
                        al[j][now] = i;
                        q.remove(j);
                        used[j] = true;
                    }
                }
            }
        }
        for(int i=0; i<n-1; i++){
            ArrayList<String> s = new ArrayList<String>();
            for(int j=0; s.size()<n-i-1; j++){
                if(i==j){
                    continue;
                }
                s.add("" + al[i][j]);
            }
            System.out.println(String.join(" ", s));
        }
        
    }
}
