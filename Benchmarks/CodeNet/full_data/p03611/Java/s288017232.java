import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] an = new int[100000+1];
        for (int i = 0; i < n; i++) {
            an[sc.nextInt()] += 1;
        }

        int max = 0;
        for (int i = 1; i < 100000+1-2; i++) {
            max = Math.max(max, an[i] + an[i+1] + an[i+2]);
        }

        System.out.println(max);
    }

}