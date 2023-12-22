import java.util.Scanner;
public class Main {
    static boolean[] bh;
    static boolean[] bw;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        int[][] ah = new int[26][h];
        int[][] aw = new int[26][w];
        char[][] ch = new char[h][w];
        
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                ch[i][j] = str.charAt(j);

                ah[ch[i][j] - 'a'][i]++;
                aw[ch[i][j] - 'a'][j]++;
            }
        }
        bh = new boolean[h];
        bw = new boolean[w];
        f(ah, bh, h);
        f(aw, bw, w);
        
        if (no(bh, h)) {
            System.out.println("NO");
            return;
        }
        if (no(bw, w)) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
//        UArr.printArr(bh);
//        UArr.printArr(bw);
        
//        for (int i = 0; i < h; i++) {
//            if (!bh[i]) {
//                System.out.println("NO");
//                return;
//            }
//        }
        
        
//        int even = 0;
//        int odd = 0;
//        for (int i = 0; i < 26; i++) {
//            if (a[i] % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
        
//        String ans = "";
//        if ((h*w) % 2 == 1) {
//            if (odd == 1) {
//                ans = "YES";
//            } else {
//                ans = "NO";
//            }
//        } else {
//            if (odd != 0) {
//                ans = "NO";
//            } else {
//                ans = "YES";
//            }
//        }
//        System.out.println(ans);
    }
    private static void f(int[][] a, boolean[] b, int n) {
//        UArr.printArr(b);
        for (int i = 0; i < n-1; i++) {
            if (b[i]) continue;
            for (int j = i+1; j < n; j++) {
                if (b[j]) continue;
                boolean flg = true;
//                U.println("i: " + i + ", j: " + j);
                for (int k = 0; k < 26; k++) {
//                    U.println("a[k][i]: " + a[k][i] + ", a[k][j]: " + a[k][j]);
                    if (a[k][i] != a[k][j]) {
//                        U.println("break");
                        flg = false;
                        break;
                    }
                }
                if (flg) {
//                    U.println("Flag is True");
                    b[i] = true;
                    b[j] = true;
//                    UArr.printArr(b);
                    continue;
                }
            }
        }
    }
    static boolean no(boolean[] b, int n) {
        int fCount = 0;
        for (int i = 0; i < n; i++) {
            if (!b[i]) fCount++;
        }
        if (n % 2 == 0 && fCount > 0){
            return true;
        }
        if (n % 2 == 1 && fCount > 1) {
            return true;
        }
        return false;
    }
}
