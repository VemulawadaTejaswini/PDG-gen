import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();

        int cnt1 = 0;
        int bi = 0;
        int ei = 1;
        int add = 1;
        int odd = 1;
        while (true) {
            if (ei>=S.length()) {
                if (ei==S.length()) {
                    if (S.length()==1) {
                        cnt1++;
                    } else if (add==1 && odd==1 && S.substring(S.length()-1, S.length()).equals(S.substring(S.length()-2,S.length()-1))) {
                        cnt1 = 0;
                    } else {
                        cnt1++;
                    }
                } else {}
                break;
            }
            String d = S.substring(bi, ei);
            odd = add;
            if (d.length()==1 && d.equals(S.substring(ei,ei+1))) {
                add = 2;
            } else {
                add = 1;
            }
            bi = ei;
            ei += add;
            cnt1++;
        }

        int cnt2 = cnt1;
        cnt1 = 0;
        bi = 0;
        ei = 2;
        add = 1;
        odd = 1;
        while (true) {
            if (ei>=S.length()) {
                if (ei==S.length()) {
                    if (S.length()==1) {
                        cnt1++;
                    } else if (add==1 && odd==1 && S.substring(S.length()-1, S.length()).equals(S.substring(S.length()-2,S.length()-1))) {
                        cnt1 = 0;
                    } else {
                        cnt1++;
                    }
                } else {}
                break;
            }
            String d = S.substring(bi, ei);
            odd = add;
            if (d.length()==1 && d.equals(S.substring(ei,ei+1))) {
                add = 2;
            } else {
                add = 1;
            }
            bi = ei;
            ei += add;
            cnt1++;
        }

        System.out.println(Math.max(cnt1,cnt2));
    }
}