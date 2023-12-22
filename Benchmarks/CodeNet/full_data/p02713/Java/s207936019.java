import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int g[][] = new int[201][201];
        for(int i=1; i<=200; i++){
            for(int j = i; j<=200; j++){
                int gcdij = gcd(i, j);
                g[i][j] = gcdij;
                g[j][i] = gcdij;
            }
        }
        long sum = 0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                int gcdij = g[i][j];
                for(int  k= 1; k<=N; k++){
                    sum += g[gcdij][k];
                }
            }
        }
        System.out.println(sum);

    }

    public static int gcd(int i, int j){
        while(i != 0){
            int res = j % i;
            j = i;
            i = res;
        }
        return j;
    }
}