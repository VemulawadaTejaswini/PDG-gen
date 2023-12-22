import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int p = sc.nextInt();

        int sum = a * 3 + p;

        int ans = sum / 2;

        System.out.println(ans);
    }
}
