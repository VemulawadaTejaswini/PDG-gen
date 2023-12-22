import java.util.HashMap;
import java.util.Scanner;

/*
説明
*/
public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();

            if (map.get(a[i]) == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i])+1);
            }
        }

        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            int ans = 0;

            for (int key :map.keySet()) {
                int temp = map.get(key);
                if (key == a[i]) {
                    ans += (temp - 1) * (temp - 2);
                } else {
                    ans += temp * (temp - 1);
                }
            }
//            if (map.size() == 1) {
//                ans += (map.get(a[0]) - 1) * (map.get(a[0]) - 2);
//            }
            num[i] = ans;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(num[i] / 2);
        }
    }
}