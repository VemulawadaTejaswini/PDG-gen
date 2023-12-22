import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ans = -1;
        for(int i = 0; i <= 1000000000; ++i){
            int x = Math.abs(a - i);
            int y = Math.abs(b - i);
            if(x == y) {ans = i; break;}
        }
        if(ans == -1) System.out.println("IMPOSSIBLE");
        else System.out.println(ans);
    }
}
