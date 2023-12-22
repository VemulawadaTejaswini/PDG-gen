import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        
        // a -> a', b -> b'
        // (次の項とのXOR)
        int[] ax = new int[n];
        int[] bx = new int[n];
        for (int i = 0; i < n; i++) {
            int ai = a[i];
            int aj = a[(i+1) % n];
            System.out.println(ai + " " + aj);
            
            ax[i] = ai^aj;
            //bx[i] = b[i] ^ b[(i+1) % n];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(ax[i]);
            System.out.println(bx[i]);
        }
        System.out.println(2^1);
        //List<Integer> ret = kmp(str, word);
        
    }
    
    // kmp をやるための前計算
    private static int[] makeTable(String str) {
        int n = str.length();
        char c[] = str.toCharArray();
        int[] ret = new int[n + 1];
        
        ret[0] = -1;
        int j = -1;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && c[i] != c[j]) j = ret[j];
            ret[i+1] = ++j;
        }
        
        return ret;
    }
    
    // 文字列Strの中で、文字列wordが何文字目スタートで現れるか
    // (str = "abcabcbab", word = "ab") => [0, 3, 7]
    public static List<Integer> kmp(String str, String word) {
        List<Integer> ret = new ArrayList<Integer>();
        
        int[] table = makeTable(word);
        char c[] = str.toCharArray();
        char w[] = word.toCharArray();
        int m = 0, i = 0, n = str.length();
        while (m + i < n) {
            if (w[i] == c[m + i]) {
                if (++i == word.length()) {
                    ret.add(m);
                    m = m + i - table[i];
                    i = table[i];
                }
            } else {
                m = m + i - table[i];
                if (i > 0) i = table[i];
            }
        }
        return ret;
    }
}
