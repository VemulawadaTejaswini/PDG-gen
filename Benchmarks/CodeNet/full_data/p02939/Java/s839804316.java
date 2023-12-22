import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String prev = String.valueOf(s.charAt(0));
        int res = 1;
        int previ = 0;
        for (int i = 1; i < s.length(); i++) {
            String tmp = s.substring(previ, i);
            if (!prev.equals(tmp)) {
                res += 1;
                previ = i;
                prev = tmp;
            }
        }
        System.out.println(res);
    }
}