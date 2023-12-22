import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();

        String str = "";

        for (int i = 0; i < s.length();) {
            str = str + s.charAt(i);
            s = s.substring(2);
        }

        System.out.println(str);

    }
}