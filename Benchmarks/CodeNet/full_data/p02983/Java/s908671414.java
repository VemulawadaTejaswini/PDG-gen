import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int tmp = Math.min(r, l + 2019);
        for (int i = l+1; i <= tmp; i++) {
            for (int j = l; j < i; j++) {
                min = Math.min(min, (i * j) % 2019);
            }
        }

        System.out.println(min);
    }
}