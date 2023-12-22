import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static int solve(int a, int b, int c, int d) {
        int total = 0;
        for(int i = a; i < b; i++){
            for(int x = c; x < d; x++){
                if(i == x){
                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(solve(a,b,c,d));
    }
}