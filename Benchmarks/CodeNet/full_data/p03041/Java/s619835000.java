import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index = scanner.nextInt();
        String str = scanner.next();
        index=index-1;
        char c = str.charAt(index);
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (i == index) {
                if (!Character.isUpperCase(c)) {
                    ans = ans + (c+"").toUpperCase();
                } else {
                    ans = ans + (c+"").toLowerCase();

                }
            } else {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);

    }
}
