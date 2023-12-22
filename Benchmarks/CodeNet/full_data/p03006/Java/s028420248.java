import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        Map<Pair, Long> map = new HashMap<>();
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i = 0; i< N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        for(int i = 0; i< N-1; i++) {
            for(int j = i+1; j< N; j++) {
                int subX = x[i] - x[j];
                int subY = y[i] - y[j];
                if(map.get(new Pair(subX, subY)) != null){
                    map.put(new Pair(subX, subY), map.get(new Pair(subX, subY)) + 1);
                }else{
                    map.put(new Pair(subX, subY), 1L);
                }
            }
        }
        Pair hoge = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        long value = map.get(hoge);


        System.out.println(N - value);

    }

    public class Pair {
        public Long x;
        public Long y;

        public Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Pair))
                return false;
            Pair ref = (Pair) obj;
            return this.x.equals(ref.x) &&
                    this.y.equals(ref.y);
        }

        @Override
        public int hashCode() {
            return x.hashCode() ^ y.hashCode();
        }

    }

}