import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> MN = numbers();
        List<Integer> mn = numbers();

        print((MN.get(0) - mn.get(0)) * (MN.get(1) - mn.get(1)));
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
}
