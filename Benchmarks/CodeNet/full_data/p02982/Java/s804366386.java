import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int [][] x = new int [n][d];
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < d ; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        
        int ans = 0;
        for(int a = 0; a < n ; a++) {
            for(int b = a+1; b < n ; b++) {
                int distSq = 0;
                for(int c = 0; c < d ; c++) {
                    int tmp = x[a][c] - x[b][c];
                    distSq += (tmp*tmp);
                }
                if(judge(distSq)) ans++;
            }
        }
        System.out.println(ans);
    }
    
    static boolean judge(int num) {
        int tmp = (int) Math.sqrt(num);
        if(tmp*tmp == num) {
            return true;
        }
        tmp++;
        if(tmp*tmp == num) {
            return true;
        }
        return false;
    }
}