import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        String[] str = new String[n];
        str = s.split("");
        str[k - 1] = str[k - 1].toLowerCase();
        for (int i = 0; i < n; i++) {
            System.out.print(str[i]);
        }
    }
}