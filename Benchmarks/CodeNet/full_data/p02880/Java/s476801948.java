import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String r = "No";
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if(N == i * j) r = "Yes";
            }
        }
        System.out.println(r);
    }
}