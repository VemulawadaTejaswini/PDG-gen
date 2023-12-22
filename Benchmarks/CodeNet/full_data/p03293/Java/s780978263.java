import java.util.Scanner;

//B - String Rotation
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        solve(S, T);
        sc.close();
    }

    public static void solve(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        boolean can = false;
        for (int i = 0; i < s.length(); i++) {
            sb.append(sb.charAt(0)).deleteCharAt(0);
            if (sb.toString().equals(t)) {
                can = true;
                break;
            }
        }
        if (can)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
