import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] ab = new int[N][2];
        for(int i=0;i<N;i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
        for(int i=0;i<M;i++){
            int c = sc.nextInt();
            int d = sc.nextInt();
            int ans = Integer.MAX_VALUE;
            int idx = -1;
            for(int j=0;j<N;j++){
                int dis = Math.abs(c-ab[j][0])+Math.abs(d-ab[j][1]);
                if(dis<ans){
                    ans = dis;
                    idx = j;
                }
            }
            System.out.println(idx);
        }
        //System.out.println(ans);
    }
}
