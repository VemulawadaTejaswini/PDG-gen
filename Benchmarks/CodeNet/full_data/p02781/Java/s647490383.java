import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        int l = s.length();
        int [] num = new int[l];
        for(int i=0; i<l; i++) {
            num[i] = c[i] - '0';
        }
        int k = sc.nextInt();
        long res = comb(l-1, k) * pow(9, k);

        if(k == 1) {
            res += num[0];
        } else if (k==2 && l >= 2) {
            res += (num[0]-1) * ((l-1) * 9) + num[1] + (l-2) * 9;
        } else if (k==3 && l >=3 ) {
            res += 1 * ((num[1]-1) * ((l-2) * 9) + num[2] + (l-3) * 9 + comb(l-2, 2) * 81) + (num[0]-1) * comb(l-1, 2) * 81;
        }
        System.out.println(res);
    }

    static long comb(int n, int k) {
        if(k == 1) {
            return n;
        }
        if(k == 2) {
            return n * (n-1) / 2;
        }
        return n * (n-1) * (n-2) / 6;
     }

     static long pow(int n, int k) {
        long res = n;
        for(int i=1; i<k; i++) {
            res *= n;
        }
        return res;
     }

}


