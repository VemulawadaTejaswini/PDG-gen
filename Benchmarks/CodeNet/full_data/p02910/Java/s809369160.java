import java.util.Scanner;

public class Main {
    //Tap Dance
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (sln(s)) {
            System.out.println("Yes");
        } else System.out.println("No");
        sc.close();
    }

    private static boolean sln(String s) {
        int n = s.length();
        String odd = "LUD";
        String even = "RUD";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && !even.contains(String.valueOf(s.charAt(i)))) return false;
            if (i % 2 == 1 && !odd.contains(String.valueOf(s.charAt(i)))) return false;
        }
        return true;
    }
}
