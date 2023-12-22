import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String s = in.next();
        String t = in.next();

        int l = 1;
        while(true) {
            if(l % n != 0 || l % m != 0) {
                l++;
            } else {
                break;
            }
        }

        boolean flag = true;
        int ln = l / n;
        int lm = l / m;
        char[] x = new char[l];

        for(int i=0; i<l; i++) x[i] = ' ';

        for(int i=0; i<n; i++) {
            int d = i * ln + 1;
            x[d-1] = s.charAt(i);
        }

        for(int i=0; i<m; i++) {
            int e = i * lm + 1;
            char tc = t.charAt(i);
            if(x[e-1] == ' ' || x[e-1] == tc) {
                x[e-1] = t.charAt(i);
            } else {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println(l);
        } else {
            System.out.println(-1);
        }
    }
}