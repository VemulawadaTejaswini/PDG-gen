import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N <= 2 && M <= 2) {
            System.out.println(0);
        } else {
            System.out.println((long)Math.max(1, N - 2) * Math.max(1, M - 2));
        }
    }
}