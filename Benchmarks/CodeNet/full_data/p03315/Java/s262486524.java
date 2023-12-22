import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '+') {
                ans++;
            }
            if (S.charAt(i) == '-') {
                ans--;
            }
        }
        System.out.println(ans);
    }
}
