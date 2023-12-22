import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P = new int[N][3];
        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
        for(int i = 0; i<N; i++){
            P[i][0] = sc.nextInt();
            P[i][1] = sc.nextInt();
            P[i][2] = sc.nextInt();
            if(P[i][2] != 0 && h0 == 0) {
                x0 = P[i][0];
                y0 = P[i][1];
                h0 = P[i][2];
            }
        }
        sc.close();
        int H;
        int t;
        for(int j = 0; j<101; j++){
            boolean res1 = false;
            for(int k = 0; k <101; k++){
                boolean res2 = true;
                H = h0 + Math.abs(j - x0) + Math.abs(k - y0);
                for(int[] p :P){
                        t = Math.max(0, H - Math.abs(j - p[0]) - Math.abs(k - p[1])) ;
                    if(t != p[2]){
                        res2 = false;
                        break;
                    }
                }
                if(res2){
                    System.out.println(j + " " + k + " " + H);
                    res1 = true;
                    break;
                }
            }
            if(res1) break;
        }

    }

}
