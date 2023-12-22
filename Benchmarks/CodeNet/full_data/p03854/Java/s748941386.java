import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        S = S.replaceAll("dream", "");
        S = S.replaceAll("dreamer", "");
        S = S.replaceAll("erase", "");
        S = S.replaceAll("eraser", "");
        if (S.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}