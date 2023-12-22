import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long k = in.nextInt();

        int count = 0;
        for (int i = 1; i <= s.length() - 3; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
                continue;
            }
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            count++;
        }

        if (s.length() >= 3 && 
            s.charAt(1) == s.charAt(s.length() - 2)) {
            count++;
        }

        System.out.println(k * count);

    }
}