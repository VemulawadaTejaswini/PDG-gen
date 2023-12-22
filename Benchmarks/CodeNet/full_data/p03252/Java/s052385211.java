import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        boolean isAns = true;

        label: for (int i = 0; i < s.length-1; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (t[i] == t[j]) {
                    if (s[i] != s[j]) {
                        isAns = false;
                        break label;
                    }
                }
            }
        }

        System.out.println(isAns ? "Yes" : "No");
    }
}
