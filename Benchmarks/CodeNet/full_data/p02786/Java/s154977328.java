import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long sum = 1;
        long rank = 1;
        while(h > 1) {
            sum += Math.pow(2, rank);
            h = h/2;
            rank++;
        }
        System.out.println(sum);
    }
}