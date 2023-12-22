import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int r = 0;
        for (int i = 1; i <= N; i++) {
            if (String.valueOf(i).length() % 2 != 0) r++;
        }
        System.out.println(r);
    }
}