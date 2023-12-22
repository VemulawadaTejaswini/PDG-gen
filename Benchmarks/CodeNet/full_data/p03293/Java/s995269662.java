import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        String U = T;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == U.charAt(j)) {
                    count++;
                }
            }
            if (count == S.length()) {
                flag = true;
                break;
            }
            count = 0;
            U = U.substring(1) + U.charAt(0);
        }
        System.out.println(flag ? "Yes" : "No");
    }
}