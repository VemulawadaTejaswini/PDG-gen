import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        int openCount = 0;
        int level = 0;
        for (char c : arr) {
            if (c == '(') {
                level++;
                sb.append(c);
            } else {
                if (level <= 0) {
                    openCount++;
                } else {
                    level--;
                }
                sb.append(c);
            }
        }
        for (int i = 0; i < openCount; i++) {
            sb.insert(0, '(');
        }
        for (int i = 0; i < level; i++) {
            sb.append(')');
        }
        System.out.println(sb);
    }
}