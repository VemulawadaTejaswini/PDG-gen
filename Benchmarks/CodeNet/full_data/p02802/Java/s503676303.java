import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        String[] s = new String[n];
        for (int i =0;i<n-1;i++) {
            p[i] = sc.nextInt();
            s[i] = sc.next();
        }

        int t = Integer.MAX_VALUE;
        boolean hasAC = false;
        int countWC = 0;
        int resAC = 0;
        int resWC = 0;
        for (int i=0;i<n;i++) {
            // next problem
            if (t != p[i]) {
                if (hasAC) {
                    ++resAC;
                    resWC+=countWC;
                }
                hasAC = false;
                countWC = 0;
            }
            // if ac
            if (s[i].equals("AC")) {
                hasAC = true;
            }
            // if wa and no ac so far, incr countwc
            if (s[i].equals("WA") && !hasAC) {
                countWC++;
            }
        }

        System.out.println(resAC+" "+resWC);
    }
}