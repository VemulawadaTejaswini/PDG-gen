import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int min = 1001;
        for(int i = 0; i < N; i++){
            int m = sc.nextInt();
            X -= m;
            min = Math.min(min, m);
        }
        int ans = N;
        while(X > 0){
            X -= min;
            if(X > 0) ans++;
        }
        System.out.println(ans);
        sc.close();
    }

}
