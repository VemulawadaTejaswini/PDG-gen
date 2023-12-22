import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); 
        String n = scan.next();
        int N = Integer.parseInt(n);
        int x = N * 800;
        int y = 200 * ( N / 15 );
        int z = x - y;
        System.out.println(z);
    }
}