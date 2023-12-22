import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int z = 0;
        int o = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % 2 == 0) {
                if (s.charAt(i) != '0') {
                    z++;
                } else {
                    o++;
                }
            } else {
                if (s.charAt(i) != '1') {
                    z++;
                } else {
                    o++;
                }
            }
        }
        System.out.println(Math.min(z, o));
    }
}
