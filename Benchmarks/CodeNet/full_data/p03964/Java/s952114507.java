import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        
        for (int i=1; i<n; i++){
            int tt = sc.nextInt();
            int aa = sc.nextInt();
            int c = Math.max(t/tt,a/aa);
            while (tt*c < t || aa*c < a)
                c++;
            t = tt*c;
            a = aa*c;
        }
        System.out.println(t+a);
            
    }

}
