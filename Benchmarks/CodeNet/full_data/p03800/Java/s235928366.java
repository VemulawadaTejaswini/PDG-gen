import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zzt on 17-2-18.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        char[] ch = s.toCharArray();
        boolean[] isSheep = new boolean[n];
        for (int i = 0; i < 2; i++) {
            isSheep[0] = i == 0;
            for (int j = 0; j < 2; j++) {
                isSheep[1] = j == 0;
                for (int k = 2; k < n; k++) {
                    if (isSheep[k - 1]) {
                        if (ch[k - 1] == 'o')
                            isSheep[k] = isSheep[k - 2];
                        else
                            isSheep[k] = !isSheep[k - 2];
                    } else {
                        if (ch[k - 1] == 'o')
                            isSheep[k] = !isSheep[k - 2];
                        else
                            isSheep[k] = isSheep[k - 2];
                    }
                    if (k == n - 1) {
                        if (((isSheep[k] && ch[k] == 'o' && (isSheep[0] == isSheep[k - 1]))
                                || (isSheep[k] && ch[k] == 'x' && (isSheep[0] != isSheep[k - 1]))
                                || (!isSheep[k] && ch[k] == 'o' && (isSheep[0] != isSheep[k - 1]))
                                || (!isSheep[k] && ch[k] == 'x' && (isSheep[0] == isSheep[k - 1])))) {
                            StringBuilder sb = new StringBuilder();
                            for (int l = 0; l < n; l++) {
                                if (isSheep[l])
                                    sb.append("S");
                                else sb.append("W");
                            }
                            System.out.println(sb.toString());
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
}