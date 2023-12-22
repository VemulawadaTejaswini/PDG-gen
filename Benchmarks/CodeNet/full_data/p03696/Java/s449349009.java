import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        StringBuilder ans = new StringBuilder(str);
        while (str.length() != 0) {
            str = str.replaceAll("\\(\\)", "");
            if (str.length() != 0) {
                if (str.charAt(0) == ')') {
                    str = "(" + str;
                    ans.insert(0, "(");
                } else {
                    str = str + ")";
                    ans.insert(ans.length(), ")");
                }
            }
        }
        System.out.println(ans);
    }
}
