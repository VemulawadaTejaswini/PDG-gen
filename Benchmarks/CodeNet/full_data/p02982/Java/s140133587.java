import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,d;

        n = sc.nextInt();
        d = sc.nextInt();

        int[][] x = new int[n][d];

        double ans = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<d;j++){
                x[i][j] = sc.nextInt();
            }
        }

        for(int j=0;j<n;j++){
            for(int i=0;i<d;i++){
                if(j!=(n-1)){
                    ans += Math.pow(Math.abs(x[j][i]-x[j+1][i]),2);
                }else{
                    ans += Math.pow(Math.abs(x[j][i]-x[0][i]),2);
                }
            }
            ans = Math.sqrt(ans);
            if(ans == (int)ans){
                count++;
            }
            ans = 0;
        }

        System.out.println(count);
    }
}