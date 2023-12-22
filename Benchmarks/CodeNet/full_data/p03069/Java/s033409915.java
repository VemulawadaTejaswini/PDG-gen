import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - Stones

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        
        char[] c = s.toCharArray();
        char[] cb = new char[n];
        char[] cw = new char[n];
        char[] cb2 = new char[n];
        
        int countB = 0;
        int countW = 0;
        int countB2 = 0;
        boolean isBlack = false;
        boolean isWhite = false;
            
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            cb[i] = c[i];
            cb2[j] = c[j];
            cw[j] = c[j];

            if (c[i] == '#') {
                isBlack = true;
            } else if (isBlack) {
                ++countB;
                cb[i] = '#';
            }

            if (c[j] == '.') {
                isWhite = true;
            } else if (isWhite) {
                ++countW;
                cw[j] = '.';
            }
            
            if (j < n - 1 && j > 0) {
                if (c[j] == '.' && cb2[j + 1] == '#' && c[j - 1] == '#') {
                    ++countB2;
                    cb2[j] = '#';
                } else if (c[j] == '#' && cb2[j + 1] == '.' && c[j - 1] == '.') {
                    ++countB2;
                    cb2[j] = '.';
                }
            }
        }

        int count = (countB < countW ?  countB : countW);
        System.out.println((count < countB2 ?  count : countB2));
    }
}