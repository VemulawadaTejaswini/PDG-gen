import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n-1];

        for(int i = 0; i < n-1; i++) {
        	b[i] = sc.nextInt();
        }

        long sum = b[0];

        for(int i = 1; i < n-1; i++) {
        	sum += (b[i-1] < b[i]) ? b[i-1] : b[i];
        }

        sum += b[n-2];

        System.out.println(sum);
    }
}