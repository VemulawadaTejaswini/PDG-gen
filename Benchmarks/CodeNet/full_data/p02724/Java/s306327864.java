import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int ans = 0;
        
        // 500
        ans += 1000 * (x / 500);
        x %= 500;
        //5
        ans += 5 * (x / 5);
        System.out.println(ans);
    }
}