import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve(System.in, System.out);
    }

    public void solve(InputStream in, PrintStream out) {
        Scanner sc = new Scanner(in);

        int a = sc.nextInt();
        for (int i = a; i < 1000000; i++) {
            if (isPrime(i)) {
                out.println(i);
                return;
            }
        }

    }
    boolean isPrime(int a) {
        for(int i=2; i*i<=a; i++) {
            if(a%i == 0) return false;
        }
        return true;
    }
}