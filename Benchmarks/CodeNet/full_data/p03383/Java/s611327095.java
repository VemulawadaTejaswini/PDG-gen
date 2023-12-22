import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        int[] a = new int[26];
        char[][] ch = new char[h][w];
        
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                ch[i][j] = str.charAt(j);
                a[ch[i][j] - 'a']++;
            }
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        String ans = "";
        if ((h*w) % 2 == 1) {
            if (odd == 1) {
                ans = "YES";
            } else {
                ans = "NO";
            }
        } else {
            if (odd != 0) {
                ans = "NO";
            } else {
                ans = "YES";
            }
        }
        System.out.println(ans);
    }
}
