import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        Collections.reverse(l);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = l.get(i);
            for (int j = i + 1; j < n; j++) {
                int b = l.get(j);
                for (int k = j + 1; k < n; k++) {
                    int c = l.get(k);
                    if(a < b + c) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
