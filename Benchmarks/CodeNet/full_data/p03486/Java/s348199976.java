import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        char[] sArr = new char[s.length()];
        char[] tArr = new char[t.length()];
        for (int i = 0; i < s.length(); i++) {
            sArr[i] = s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            tArr[i] = t.charAt(i);
        }
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(t.length() - i - 1);
            if (tChar > sChar) {
                System.out.println("Yes");
                return;
            } else if (tChar < sChar) {
                System.out.println("No");
                return;
            }
        }
        if (s.length() < t.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
