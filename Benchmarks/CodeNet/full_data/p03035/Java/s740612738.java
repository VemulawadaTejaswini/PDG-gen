import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int answer = 0;
        if (a >= 13) {
            answer = b;
        } else if ((6 <= a) && (a <= 12)) {
            answer = b / 2;
        }
        System.out.println(answer);
        sc.close();
    }
}