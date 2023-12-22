import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = sc.nextInt();
        }
        int c = 0;
        int max = 0;
        for (int l = 0 ; l < n ; l++) {
            while (l < n - 1 && h[l] >=  h[l + 1]) {
                c++;
                l++;
            }
            max = Math.max(max, c);
            c = 0;
        }
        System.out.println(max);
    }

}