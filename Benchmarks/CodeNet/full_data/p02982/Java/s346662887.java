import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for(int i=0; i<n; i++) {
            for(int j=0; j<d; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                double total = 0;
                for(int k=0; k<d; k++) {
                    int sub = (x[i][k]) - (x[j][k]);
                    total += Math.pow(sub, 2);
                }
                total = Math.sqrt(total);
                if(total == Math.floor(total)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}