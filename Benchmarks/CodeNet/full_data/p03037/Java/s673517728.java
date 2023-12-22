import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] lr = new int[m][2];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                lr[i][j] = scan.nextInt();
            }
        }
        boolean b = true;
        int out = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < m; j++){
                if(lr[j][0] > i || lr[j][1] < i){
                    b = false;
                }
            }
            if(b){
                out++;
            }
            b = true;
        }
        System.out.println(out);
    }
}