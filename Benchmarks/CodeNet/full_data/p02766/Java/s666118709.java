import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int a = 1;
        int cnt = 0;
        do {
            a = a * R;
            cnt++;
        } while (a <= N);

        System.out.println(cnt);
    }
}
