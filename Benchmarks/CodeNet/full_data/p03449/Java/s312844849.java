import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {Main instance = new Main();sc = instance.new Scanner();instance.solve();}
    private class Scanner {String[] s = new String[0];String regex = " ";int i = 0;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));public String next() {try {if (i < s.length) { return s[i++];}String st = br.readLine();while ("".equals(st)) { st = br.readLine(); }s = st.split(regex, 0);i = 0;return s[i++];} catch (IOException e) { return null; }}public int nextInt(){return Integer.parseInt(next());}}        
    private static Scanner sc;

    private void solve() {
        int N = sc.nextInt();
        int[] A1 = new int[N];
        int[] A2 = new int[N];
        for (int i = 0; i < N; i++) {
            A1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A2[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            for (int j = 0; j <= i; j++) {
                tmp += A1[j];
            }
            for (int j = i; j < N; j++) {
                tmp += A2[j];
            }
            if (tmp > ans) {
                ans = tmp;
            }
        }
        System.out.println(ans);
    }
}