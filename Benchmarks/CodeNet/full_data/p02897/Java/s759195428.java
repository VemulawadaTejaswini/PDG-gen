import java.util.Scanner;

public class Solution {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double d = Math.round(N/2) / N;
        System.out.println(d);
    }
}