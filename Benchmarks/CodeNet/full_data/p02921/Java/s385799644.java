import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        sc.close();

        int cnt = 0;

        for (int i=0; i<S.length(); i++) {
            if (S.substring(i,i+1).equals(T.substring(i,i+1)))
                cnt++;
        }
        System.out.println(cnt);
    }
}