import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[] r = new int[R+1];
        for(int i=1;i<=R;i++) r[i] = sc.nextInt();
        int[] A = new int[M+1];
        int[] B = new int[M+1];
        int[] C = new int[M+1];
        for(int i=1;i<=M;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        int[][] g = new int[N+1][N+1];
        for(int row=1;row<=N; row++){
            for(int col=1; col<=N; col++) {
                if(row==col) g[row][col]=0;
                else g[row][col] = 1234567;
            }
        }
        for(int i=1;i<=M;i++){
            int a = A[i];
            int b = B[i];
            g[a][b] = C[i];
            g[b][a] = C[i];
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                for(int k=1;k<=N;k++){
                    g[j][k] = Math.min(g[j][k], g[j][i]+g[i][k]);
                }
            }
        }
        int[][] map = new int[R+1][R+1];
        for(int row=1; row<=R; row++){
            for(int col=row; col<=R; col++){
                if(row==col) map[row][col]=0;
                else{
                    map[row][col] = g[r[row]][r[col]];
                    map[col][row] = g[r[row]][r[col]];
                }
            }
        }
        long sum = 0;
        ArrayList<Integer> direct = new ArrayList<>();
        for(int i=1;i<R;i++){
            for(int j=i+1;j<=R;j++){
                boolean flag = true;
                for(int k=1;k<=R;k++){
                    if(k==i||k==j) continue;
                    if(map[i][j]==map[i][k]+map[k][j]){
                        flag = false;
                        break;
                    }
                }
                direct.add(map[i][j]);
                if(flag) {
                    sum += map[i][j];

                }
            }
        }
        int[] dir = new int[direct.size()];
        for(int i=0;i<dir.length;i++) dir[i] = direct.get(i);
        Arrays.sort(dir);
        long ans = 2*sum-dir[dir.length-1];

        System.out.println(ans);
    }
}
