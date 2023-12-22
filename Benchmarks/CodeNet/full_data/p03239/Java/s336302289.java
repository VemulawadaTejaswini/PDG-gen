import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int ans = 1001;
        for (int i=0;i<n;i++){
            int c = sc.nextInt();
            if (sc.nextInt()<t)ans=Math.min(c,ans);
        }
        System.out.println(ans);
    }
}
