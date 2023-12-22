import java.io.PrintWriter;
import java.util.*;
//https://qiita.com/p_shiki37/items/3902f4e3adc3aeb382f1

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int sl = S.length();
        long K = Long.parseLong(sc.next());
        sc.close();

        long count = 0;
        boolean all = true;
        char c = S.charAt(0);
        for (int i=0; i<sl-1; i++) {
            if (S.charAt(i) != c) {
                all = false;
                break;
            }    
        }
        if (all) {
            count = sl * K / 2;
            System.out.println(count);
            return;
        }
        int cf = 0;
        int ce = 0;
        if (S.charAt(sl - 1) == c) {
            for (int i=0; i<sl; i++) {
                if (S.charAt(i) == c) {
                    cf++;
                } else {
                    break;
                }
            }
            for (int i=sl-1; i>0; i--) {
                if (S.charAt(i) == c) {
                    ce++;
                } else {
                    break;
                }
            }
            count += cf / 2 + ce / 2 + (cf + ce) / 2 * (K - 1);

            String S1 = S.substring(cf, sl - ce);
            boolean sf = false;
            long count1 = 0;
            for (int i=0; i<S1.length()-1; i++) {
                if (S1.charAt(i) != S1.charAt(i+1)) {
                    sf = false;
                } else {
                    if (sf) {
                        sf = false;
                    } else {
                        sf = true;
                        count1++;
                    }
                }
            }
            count += K * count1;
            System.out.println(count);
            return;
        }
        boolean sf = false;
        for (int i=0; i<S.length()-1; i++) {
            if (S.charAt(i) != S.charAt(i+1)) {
                sf = false;
            } else {
                if (sf) {
                    sf = false;
                } else {
                    sf = true;
                    count++;
                }
            }
        }
        count *= K;
        System.out.println(count);
    }
}