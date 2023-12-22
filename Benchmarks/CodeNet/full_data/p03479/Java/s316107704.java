import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        int cnt = 0;
        long now = X;
        while (now <= Y) {
            cnt++;
            now *= 2;
        }
        System.out.println(cnt);
    }
}