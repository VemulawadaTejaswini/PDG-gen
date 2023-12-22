import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int ans = 1001;
        for (int i = 0; i < n; i++){
            int ci = sc.nextInt();
            int ti = sc.nextInt();
            if( ti <= t){
                ans = Math.min(ans, ci);
            }
        }
        if(ans != 1001) {
            System.out.println(ans);
        } else {
            System.out.println("TLE");
        }
    }
}
