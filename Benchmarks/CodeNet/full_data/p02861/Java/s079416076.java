import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact *  i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        double[][] inp = new double[N][2];
        for(int i = 0; i < N ;i++){
            inp[i][0] = Double.parseDouble(sc.next());
            inp[i][1] = Double.parseDouble(sc.next());
        }
        double total = 0d;
        for(int i = 0; i < N - 1 ; i++){
            for(int j = i+1; j < N ;j++){
                total += Math.sqrt(
                Math.pow(inp[i][0]-inp[j][0],2)+
                Math.pow(inp[i][1]-inp[j][1],2)
                );
            }
        }
        System.out.println(total*2/N);
        //Caluclate mean
    }
}