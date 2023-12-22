import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);
    private static List<Integer> list;
    private static Map<Integer, Integer> map;
    
    public static void main(String[] args) {
        make();
        
        int n = sc.nextInt();
        if (!list.contains(n)) {
            so.println("no");
            return;
        }
        
        so.println("yes");
        int w = map.get(n);
        int h = w + 1;
        int a = 1;
        int b = 1;
        int[][] lists = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i <= j) {
                    lists[i][j] = a++;
                }
            }
        }
        for (int j = 0; j < w; j++) {
            for (int i = 0; i < h; i++) {
                if (i > j) {
                    lists[i][j] = b++;
                }
            }
        }
        print(lists);
    }
    
    static void print(int[][] list) {
        so.println(list.length);
        for (int i = 0; i < list.length; i++) {
            so.print(list[i].length + " ");
            for (int j = 0; j < list[i].length; j++) {
                so.print(list[i][j]);
                if (j != list[i].length - 1) {
                    so.print("");
                }
            }
            so.println();
        }
    }

    static private void make() {
        list = new ArrayList<>();
        map = new HashMap<>();
        
        for (int i = 2; ; i++) {
            if (i * (i + 1) > 200000) {
                break;
            }
            list.add(i * (i+1) / 2);
            map.put(i * (i+1) / 2, i);
        }
    }
    
}
