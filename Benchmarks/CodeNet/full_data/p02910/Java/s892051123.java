import java.util.Scanner;

public class Main {
    static String s;
    static int len;
    static Character[] c;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        len = s.length();
        c = new Character[len];
        for(int i = 0; i < len; i++) {
            c[i] = s.charAt(i);
        }
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        boolean ok = true;
        for(int i = 0; i < len; i++) {
            if(i % 2 == 0 && !(c[i].equals('R') || c[i].equals('U') || c[i].equals('D'))) {
                ok = false;
                break;
            }
            if(i % 2 == 1 && !(c[i].equals('L') || c[i].equals('U') || c[i].equals('D'))) {
                ok = false;
                break;
            }
        }

        if(ok) System.out.println("Yes");
        else System.out.println("No");
    }
}
