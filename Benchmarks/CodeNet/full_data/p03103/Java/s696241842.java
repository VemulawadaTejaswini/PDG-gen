import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
      	
        Map<Integer, Integer> stores = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            stores.put(in.nextInt(), in.nextInt());
        }
        long yen = 0;
        for (int key : stores.keySet()) {
            while (stores.get(key) > 0) {
                m--;
                stores.put(key, stores.get(key) - 1);
                yen += key;
                if (m == 0) {
                    System.out.println(yen);
                    return;
                }
            }
        }
      while(true) {
          m++;
        }
    }
}
