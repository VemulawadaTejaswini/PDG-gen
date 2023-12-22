import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        creature[] cs = null;
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] elems = br.readLine().split(" ");
            n = Integer.parseInt(elems[0]);
            cs = new creature[n];
            elems = br.readLine().split(" ");
            for (int i = 0; i < cs.length; i++) {
                cs[i] = new creature(i, Integer.parseInt(elems[i]));
                sum += cs[i].size;
            }
            cs = Arrays.stream(cs).sorted((c1, c2) ->
                    Integer.compare(c1.size, c2.size)).toArray(creature[]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int ans = 0;
        boolean flg;
        for (int i = n-1; i >= 0; i--) {
            int trgSize = sum * 2;
            flg = true;
            for (int j = i+1; j < cs.length; j++) {
                if (trgSize < cs[j].size) {
                    flg = false;
                    break;
                }
                trgSize += cs[j].size * 2;
            }
            if (flg)
                ans++;
            sum -= cs[i].size;
        }
        System.out.println(ans);
    }
}

class creature {
    int color;
    int size;
    public creature(int c, int s) {
        color = c;
        size = s;
    }
}
