import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s;
        try (Scanner cin = new Scanner(System.in)) {
            s = cin.next();
        }
        int cindex = s.indexOf('C');
        if (s.startsWith("A") && cindex > 1 && cindex < s.length() - 1) {
            for (int i = 1; i < s.length(); i++) {
                if (i != cindex && !Character.isLowerCase(s.charAt(i))) {
                    System.out.println("WA");
                    return;
                }
            }
            System.out.println("AC");
            return;
        }

        System.out.println("WA");
    }
}