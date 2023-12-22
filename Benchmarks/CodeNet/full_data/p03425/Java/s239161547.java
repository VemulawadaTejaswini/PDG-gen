import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = 0, a = 0, r = 0, c = 0, h = 0;
        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);
            if (ch == 'M') {
                m++;
            } else if (ch == 'A') {
                a++;
            } else if (ch == 'R') {
                r++;
            } else if (ch == 'C') {
                c++;
            } else if (ch == 'H') {
                h++;
            }
        }
        int count = m * a * r + m * a * c + m * a * h
                    + m * r * c + m * r * h + m * c * h
                    + a * r * c + +a * r * h + a * c * h
                    + r * c * h;
        System.out.println(count);
    }
}
