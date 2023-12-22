import java.util.Scanner;

//B - AcCepted
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (check(S))
            System.out.println("AC");
        else
            System.out.println("WA");
        sc.close();
    }

    static boolean check(String s) {
        if (s.charAt(0) != 'A') return false;
        int cnt = 0;
        for (int i = 1; i < s.length(); i++)
            if (i >= 2 && i <= s.length() - 2) {
                if (s.charAt(i) == 'C') {
                    if (++cnt > 1) return false;
                }else if (!Character.isLowerCase(s.charAt(i)))
                    return false;
            } else if (!Character.isLowerCase(s.charAt(i)))
                return false;
        return cnt == 1;
    }
}
