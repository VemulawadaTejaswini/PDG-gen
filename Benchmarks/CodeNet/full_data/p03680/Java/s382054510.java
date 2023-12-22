import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }
            int now = a[0];
            int count = 1;
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (true) {
                if (now == 2) {
                    System.out.println(count);
                    break;
                } else {
                    boolean flag = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (now == list.get(i)) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println(-1);
                        break;
                    } else {
                        list.add(now);
                    }
                }
                now = a[now - 1];
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}