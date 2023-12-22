import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        NextPermutation pe = new NextPermutation(N);
        int a = 0;
        int b = 0;
        int lap = 0;
        String p = "";
        String q = "";
        for (int i = 0; i < N; i++) {
            p += sc.next();
        }
        for (int i = 0; i < N; i++) {
            q += sc.next();
        }
        sc.close();
        
        do {
            ++lap;
            if (pe.toString().equals(p)) a = lap;
            if (pe.toString().equals(q)) b = lap;
        } while (pe.next());
        
        out.println(Math.abs(a - b));
        
        out.flush();
    }
}

class NextPermutation {
    final int n, a[];

    public NextPermutation(int n) {
        this.n = n;
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = i;
    }

    public boolean next() {  // 辞書式順序で次の順列
        a[0] = 0;  // 番人
        int i = n - 1;
        while (a[i] >= a[i + 1]) i--;
        if (i == 0) return false;  // 完了
        int j = n;
        while (a[i] >= a[j]) j--;
        int swap = a[i];  a[i] = a[j];  a[j] = swap;
        i++;  j = n;
        while (i < j) {
            swap = a[i];  a[i] = a[j];  a[j] = swap;  i++;  j--;
        }
        return true;  // 未了
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 1; i <= n; i++) s += a[i];
        return s;
    }

}