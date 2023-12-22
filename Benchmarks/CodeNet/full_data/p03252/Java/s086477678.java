import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        s.append(sc.nextLine());
        t.append(sc.nextLine());
        sc.close();

        for (int i = 0; i < s.length(); i++) {
            int flag[] = new int[s.length()];
            for (int k = 0; k < s.length(); k++) {
                flag[k] = 0;
            }

            if (s.charAt(i) != t.charAt(i)) {
                Character a = s.charAt(i);
                Character b = t.charAt(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == a) {
                        s.setCharAt(j, b);
                    } else if (s.charAt(j) == b) {
                        s.setCharAt(j, a);
                    }
                }
            }
        }
        if (s.toString().equals(t.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
