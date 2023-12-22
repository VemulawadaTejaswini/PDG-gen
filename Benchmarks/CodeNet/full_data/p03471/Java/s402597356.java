import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    public static void solve(Scanner sc){
        int N = sc.nextInt();
        int Y = sc.nextInt();

        for(int i=0;i<=N;i++){
            for(int j=0;j<=N-i;j++){
                int k = N - i - j;
                if(10000*i + 5000*j + 1000*k == Y){
                    System.out.printf("%d %d %d\n", i,j,k);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}