import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        int res = 0;
        String prev = "";
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {

            if (prev.equals(String.valueOf(cs[i]))) {
                if (i != cs.length - 1) {
                    prev = String.valueOf(cs[i]) + String.valueOf(cs[i + 1]);
                }
                i++;
            } else {
                prev = String.valueOf(cs[i]);
            }
            
            res += 1;
        }

        if (cs[cs.length - 1] == cs[cs.length - 2]) {
            res -= 1;
        }

        System.out.println(res);
    }
}