import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC158C - Tax Increase  ... WA

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = -1;
        for (int i = 1; i <= 100; i++) {
            if ((int)(i * 0.08) == a && 
                (int)(i * 0.10) == b) {
                    ans = i;
                    break;
                }
        }
        
        
       System.out.println(ans);
    }
}