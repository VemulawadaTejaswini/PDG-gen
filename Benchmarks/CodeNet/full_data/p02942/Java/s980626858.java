import java.util.Scanner;
//import java.util.ArrayList;
class Main {

    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        n = stdIn.nextInt();
        m = stdIn.nextInt();
        int[][] a = new int[n][m];

        for(int i = 0;i < n ;i++){
            for(int j = 0;j<m;j++){
                a[i][j] = stdIn.nextInt();
            }
        }

        for(int j = 0;j < m;j++) {
            int[] g = new int[n];
            for(int i = 0;i < n;i++){
                g[i] = gyou(a[i][j]);
            }
            for(int i = 0;i < n;i++) {
                for(int k = 0;k < i;k++){
                    if(g[i] == g[k]){
                        //a[i][j]をa[i][h]と入れ替える gyou(a[i][h])がg[k]のいずれでもないように(h > j)
                        for(int h = j+1;h < m;h++){
                            for(int l = 0;l < i;l++){
                                if(gyou(a[i][h]) == g[l]){
                                    break;
                                }
                                if(l == i-1) {
                                    int x = a[i][j];
                                    a[i][j] = a[i][h];
                                    a[i][h] = x;
                                    g[i] = gyou(a[i][j]);
                                }
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                System.out.println(a[i][j]);
            }
        }

        for(int j = 0;j < m;j++){
            int g[] = new int[n];
            for(int i = 0;i < n;i++) {
                g[i] = gyou(a[i][j]);
            }
            for(int i = 0;i < n;i++){
                if(g[i] != i){
                    for(int h = i+1;h < n;h++){
                        if(g[h] == i){
                            int x = a[i][j];
                            a[i][j] = a[h][j];
                            a[h][j] = x;
                            break;
                        }
                    }
                }
            }
        }

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                System.out.println(a[i][j]);
            }
        }
    }

    static int gyou(int n){
        int count = 0;
        while(n > m){
            n -= m;
            count++;
        }
        return count;
    }

}