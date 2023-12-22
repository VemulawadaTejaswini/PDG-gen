import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws Exception {
        Map<Integer, Long> G = new HashMap<Integer, Long>();
        Map<Integer, Integer> V = new HashMap<Integer, Integer>();
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Pair[] d = new Pair[N+1];
        int[] n = new int[N+1];
        long[] m = new long[N+1];
        int i = 0, flag = 0;
        for(i = 1 ; i <= N ; i++){
            G.put(i, sc.nextLong());
            n[i] = 1;
        }
        G = G.entrySet().stream()
        .sorted(Entry.<Integer, Long>comparingByValue().reversed())
        .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));
        i = 1;
        for (int key : G.keySet()){
            d[i] = new Pair(key, G.get(key));
            i++;
        }
        for(i = 1 ; i < N ; i++){
            flag = 0;
            for(int j = i+1 ; j <= N ; j++){
                if(d[i].b-(long)N+(long)(2*n[i]) == d[j].b){
                    n[j] += n[i];
                    m[j] += n[i]+m[i];
                    V.put(d[i].a, d[j].a);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("-1");
                System.exit(0);
            }
        }
        if(m[N]!=d[N].b){
            System.out.println("-1");
            System.exit(0);
        }
        for (Integer key : V.keySet()) {
            System.out.println(key + " " + V.get(key));
        }
    }

    static class Pair implements Comparable<Pair> {
        int a;
        long b;
        Pair(int a,long b) {
            this.a = a;
            this.b = b;
        }    
        @Override
        public int compareTo(Pair o) {
            return Long.compare(a, o.b);
        }
    }
}