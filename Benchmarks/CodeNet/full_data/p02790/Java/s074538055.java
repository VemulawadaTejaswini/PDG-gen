import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "";
        for (int i = 0; i < Math.max(a, b); i++) {
            ans += Math.min(a, b);
        }
        System.out.println(ans);
        sc.close();
    }
}