import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        long K = sc.nextLong();

        int maxLength = (int) Math.min(S.length(), K);
        for (int i = 0; i < maxLength; i++) {
            if (S.charAt(i) != '1') {
                System.out.println(S.charAt(i));
                return;
            }
        }
        System.out.println(1);
    }
}
