import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int c = 1;
        for (int i = 0 ; i < n - 1 ; i++) {
            if (s[i] != s[i + 1]) c++;
        }
        System.out.println(c);
    }

}
