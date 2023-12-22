import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {Main instance = new Main();sc = instance.new Scanner();instance.solve();}
    private class Scanner {String[] s = new String[0];String regex = " ";int i = 0;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));public String next() {try {if (i < s.length) { return s[i++];}String st = br.readLine();while ("".equals(st)) { st = br.readLine(); }s = st.split(regex, 0);i = 0;return s[i++];} catch (IOException e) { return null; }}public int nextInt(){return Integer.parseInt(next());}}        

    private void solve() {
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] a1 = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < N; i++) {
            a1[i] = a[(N-1)-i];
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += a1[i] * (i%2==0 ? 1 : -1 );
        }
        System.out.println(ans);
    }
}