import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X<=5){
            if(X==1||X==2)System.out.println(X);
            if(X==3)System.out.println("2");
            if(X==4)System.out.println("3");
            if(X==5)System.out.println("3");
            return;
        }
        System.out.println(X/2);
    }
}