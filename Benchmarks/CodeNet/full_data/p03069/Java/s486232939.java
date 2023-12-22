import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int cnt = 0;
        for (int i=0; i<N-1; i++) {
            String now = String.valueOf(S.charAt(i));
            String next = String.valueOf(S.charAt(i+1));
            if (now.equals("#") && next.equals(".")) {
                StringBuffer loop = new StringBuffer(S);
                loop.setCharAt(i, '.');
                S = loop.toString();
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
