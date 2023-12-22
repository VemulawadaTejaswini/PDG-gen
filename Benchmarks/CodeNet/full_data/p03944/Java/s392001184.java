import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int WX = sc.nextInt();
        int HY = sc.nextInt();
        int ZX = 0;
        int ZY = 0;
        int N = sc.nextInt();
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if (map.containsKey(a)) {
                int[] ar = map.get(a);
                switch (a) {
                case 1 :
                    if (ar[0] < x) {
                        int[] arr = {x, y};
                        map.put(a, arr);
                    }
                    break;
                case 2 :
                    if (ar[0] > x) {
                        int[] arr = {x, y};
                        map.put(a, arr);
                    }
                    break;
                case 3 :
                    if (ar[1] < y) {
                        int[] arr = {x, y};
                        map.put(a, arr);
                    }
                    break;
                case 4 :
                    if (ar[1] > y) {
                        int[] arr = {x, y};
                        map.put(a, arr);
                    }
                }
            } else {
                int[] ar = {x, y};
                map.put(a, ar);
            }
        }
        for (int key : map.keySet()) {
            if (key == 1) {
                ZX = map.get(key)[0];
            } else if (key == 2) {
                WX = map.get(key)[0];
            } else if (key == 3) {
                ZY = map.get(key)[1];
            } else {
                HY = map.get(key)[1];
            }
        }
        int ans = (WX-ZX)*(HY-ZY);
        System.out.println(Math.max(ans, 0));
    }
    
}
