import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        String preS = "";
        int r = 0;
        for (char s:
             S.toCharArray()) {
            String curS = String.valueOf(s);
            if (!preS.equals(curS)) {
                preS = curS;
                r++;
            }
        }

        System.out.println(r);
    }
}