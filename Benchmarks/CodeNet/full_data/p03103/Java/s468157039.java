import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> NM = numbers();
        List<Store> stores = new ArrayList<>();

        for(int n=0; n<NM.get(0); n++) {
            List<Integer> AB = numbers();
            stores.add(Store.of(AB.get(0), AB.get(1)));
        }

        stores.sort(Comparator.comparing(store -> store.yen));

        long amount = 0;
        int hon = NM.get(1);

        for(Store store: stores) {
            if(store.num < hon) {
                amount += store.num * store.yen;
                hon -= store.num;
            } else {
                amount += store.yen * hon;
                break;
            }
        }

        print(amount);

    }

    static class Store {
        public int yen;
        public int num;

        static Store of(int yen, int num) {
            Store store = new Store();
            store.num = num;
            store.yen = yen;

            return store;
        }

        public String toString() {
            return yen + ", " + num;
        }
    }

    public static List<Integer> numbers() {
        List<Integer> integers = new ArrayList<>();
        for(String item: getLine().split(" ")) {
            integers.add(toInt(item));
        }
        return integers;
    }

    public static void add(int[][] a, int[] n, int[] m) {
        for(int i = 0; i < n.length; i++) {

        }
    }

    public static int sum(int[][] a, int[] n, int[] m) {
        int sum = 0;
        for(int i=0; i<n.length; i++) {
            for(int j=0; j<m.length; j++) {
                if(n[i] == 1 && m[j] == 1) {
                    sum += a[i][j];
                }
            }
        }

        return sum;
    }

    public static int getInt() {
        return scan.nextInt();
    }

    public static String getLine() {
        return scan.nextLine();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static long toLong(String str) {
        return Long.parseLong(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(int num) {
        print("" + num);
    }

    public static void print(long num) {
        print("" + num);
    }
}
