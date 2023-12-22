import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = sc.next();

        String result = "";
        for (int i = 0; i < n; i++) {
            result += "" + s.charAt(i) + t.charAt(i);
        }

        System.out.println(result);

        sc.close();
    }
}
