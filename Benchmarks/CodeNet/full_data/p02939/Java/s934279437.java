import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        int res = 0;
        String prev = "";
        boolean sameflg = false;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {

            String nows = String.valueOf(cs[i]);
            if (prev.equals(nows)) {
                sameflg = true;
            } else {
                res += 1;
                if (sameflg) {
                    sameflg = false;
                    prev += nows;
                } else {
                    prev = nows;
                }
            }
            System.out.println(prev);
        }

        System.out.println(res);
    }
}