import java.util.*;
import java.util.stream.IntStream;

public class Main {
        static boolean[][] f;
        static  int[][] p;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Map<Integer, Tama> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if(map.containsKey(num)) {
                Tama tmp = map.get(num);
                tmp.count++;
            }
            else {
                Tama tmp = new Tama(num, 1);
                map.put(num, tmp);
            }
        }
        if(map.size() - k <= 0) {
            System.out.println(0);
            return;
        }
        System.out.println(map.values().stream().sorted(Comparator.comparingInt(x -> x.count)).limit(map.size() - k).mapToInt(x -> x.count).sum());

    }

    public static class Tama{
        int num;
        int count;

        public Tama(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
}

