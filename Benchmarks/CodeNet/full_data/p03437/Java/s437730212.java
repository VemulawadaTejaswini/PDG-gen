import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long x = in.nextLong();
        long y = in.nextLong();
        if (x % y == 0){
            System.out.println(-1);
            return;
        }
        System.out.println(x);
    }
}