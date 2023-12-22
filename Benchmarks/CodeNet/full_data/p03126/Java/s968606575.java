import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tmpk;
        boolean[][] nums = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            tmpk = sc.nextInt();
            for (int j = 0; j < tmpk; j++) {
                nums[i][sc.nextInt() - 1] = true;
            }

        }
        boolean b;
        int output=0;
        for(int i=0;i<m;i++){
            b=true;
            for(int j=0;j<n;j++){
                if(!nums[j][i]){
                    b=false;
                }
            }
            if(b){
                output++;
            }
        }
        System.out.println(output);

    }
}