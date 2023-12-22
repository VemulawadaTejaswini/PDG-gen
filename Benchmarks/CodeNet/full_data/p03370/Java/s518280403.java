import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int min = Collections.min(list);
        Collections.sort(list);
        int tmp = x;
        for (int i = 0; i < n; i++) {
            tmp -= list.get(i);
        }
        int ans = n;
        while(true) {
            if(tmp < 0) {
                System.out.println(ans - 1);
                return;
            } else {
                tmp -= min;
                ans++;
            }
        }
    }
}