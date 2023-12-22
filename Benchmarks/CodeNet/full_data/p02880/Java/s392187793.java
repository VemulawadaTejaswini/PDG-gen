import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        boolean ok = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // i * j の全通りを試し、Nになるものがあればフラグを立てる
                if (i * j == N) ok = true;
            }
        }
        if(ok) System.out.println("Yes");
        else System.out.println("No");

    }
}
