import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<n; j++){
                a[j][i] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            int mans = 0;
            int j = i;
            for(int k=0; k<=j; k++){
                mans += a[k][0];
            }
            for(int k=j; k<n; k++){                
                mans += a[k][1];
            }
            ans = Math.max(ans, mans);
        }

        System.out.println(ans);
    }
}