import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long ans = 0;
        if (H%2 == 0) {
            ans = (H*W/2);
        } else {
            ans = (H*W/2)+1;
        }
        System.out.println(ans);
    }
}