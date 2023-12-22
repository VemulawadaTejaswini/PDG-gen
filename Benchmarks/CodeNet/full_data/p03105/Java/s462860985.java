import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int ans = 0;
        if(b >= a * c) {
        	ans = c;
        }else {
        	ans = b /a;
        }

        System.out.println(ans);
    }
}