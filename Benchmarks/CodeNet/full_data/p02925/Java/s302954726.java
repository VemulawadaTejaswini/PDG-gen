
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            map[i][0] = 0;
            for(int j=1;j<n;j++){
                map[i][j] = sc.nextInt();
            }
        }

        int[] now = new int[n+1];
        int res = 0;
        for(int i=1;i<1000000;i++){
            int[] sche = new int[n+1];
            boolean canContinue = false;
            for(int j=1;j<=n;j++){
                if(sche[j]==1)continue;
                int aite = map[j][now[j]+1];
                if(map[aite][now[aite]+1]==j && sche[aite]==0){
                    sche[j] = 1;
                    sche[aite] = 1;
                    now[j]++;
                    now[aite]++;
                    canContinue = true;
                }
            }
            //System.out.println("today");
            //dump(sche);
            //dump(now);
            if(!canContinue){
                for(int j=1;j<=n;j++){
                    if(now[j]!=n-1){
                        System.out.println(-1);
                        return;
                    }
                }
                System.out.println(i-1);
                return;
            }
        }
    }

    public static void dump(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}