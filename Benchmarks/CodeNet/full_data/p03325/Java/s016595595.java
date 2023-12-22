import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        int ans = 0;
        while(true) {
            boolean flag = false;
            Collections.sort(list);
            Collections.reverse(list);
            for (int i = 0; i < n; i++) {
                if(!flag) {
                    if(list.get(i) % 2 == 0) {
                        list.set(i, list.get(i) / 2);
                        flag = true;
                        break;
                    }
                }
            }
            if(flag) {
                ans++;
            } else {
                System.out.println(ans);
                return;
            }
        }
    }
}