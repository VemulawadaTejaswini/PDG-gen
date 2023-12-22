import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] s = new int[n];
        Arrays.fill(s, 20);

        for(int i = 0; i < m; ++i) {
            int sIndex = Integer.parseInt(sc.next()) - 1;
            int sNumber = Integer.parseInt(sc.next());
            if(s[sIndex] == 20) {
                s[sIndex] = sNumber;
            } else if(s[sIndex] >= 0 && sNumber != s[sIndex]) {
                s[sIndex] = -1;
            }
        }

        // System.out.println("s = " + Arrays.toString(s));
        
        if((s[0] == 0 && s.length > 1) || hasNegative(s)) {
            System.out.println(-1);
            return;
        }

        for(int i = 0; i < 1000; ++i) {
            String iStr = String.valueOf(i);
            if(iStr.length() < n) {
                continue;
            }

            if(iStr.length() > n) {
                break;
            }

            if(isValidNumber(iStr, s)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);

    }

    static boolean hasNegative(int[] s) {
        for(int i = 0, f = s.length; i < f; ++i) {
            if(s[i] < 0) {
                return true;
            }
        }
        return false;
    }

    static boolean isValidNumber(String iStr, int[] s) {
        for(int j = 0, f = s.length; j < f; ++j) {
            if(s[j] == 20) {
                continue;
            }

            if((iStr.charAt(j) - '0') != s[j]) {
                // System.out.println("j = " + j);
                // System.out.println("istr = " + iStr + ", s = " + Arrays.toString(s));
                return false;
            }
        }
        return true;
    }
}