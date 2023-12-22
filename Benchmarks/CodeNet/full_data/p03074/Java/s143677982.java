import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int k = Integer.parseInt(tmp[1]);
        char[] s = br.readLine().toCharArray();

        List<Integer> list = new ArrayList<>();
        boolean b = true;
        int i;
        for(i = 0; i < n; i++) {
            if(b != (s[i] == '1')) {
                list.add(i);
                b = !b;
            }
        }
        if(list.size() == 0 || list.get(list.size() - 1) != i + 1) list.add(i);
        if(list.size() % 2 == 0) list.add(i);

        if(list.size() % 2 == 0) list.add(i);
        int ans = 0;
        int j = 0;
        do {
            ans = Math.max(ans, list.get(Math.min(j + 2 * k, list.size() - 1)) - (j == 0? 0 : list.get(j - 1)));
            j += 2 * k;
        }while(j < list.size() - 2 * k);

        System.out.println(ans);
    }
}