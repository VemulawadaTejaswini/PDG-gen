import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        HashMap<Long,HashSet<Integer>> mapA = new HashMap<>();
        for (int i = 0;i < a.length;++i){
            a[i] = sc.nextLong();
            if(!mapA.containsKey(a[i]))mapA.put(a[i],new HashSet<>());
            mapA.get(a[i]).add(i);
        }
        HashSet<Integer>[] graph = new HashSet[n];
        HashSet<Integer> kst = new HashSet<>();
        for (int i = 0;i < a.length;++i){
            for (int j = 0;j <= 30;++j){
                long t = (2L << j) - a[i];
                if(mapA.containsKey(t)){
                    if(graph[i] == null)graph[i] = new HashSet<>();
                    graph[i].addAll(mapA.get(t));
                    kst.add(i);
                }
            }
        }
        for (int i:kst){
            graph[i].remove(i);
        }
        ArrayList<Integer> keys = new ArrayList<>(kst);
        keys.sort((i1,i2) -> {
            int s1 = graph[i1].size();
            int s2 = graph[i2].size();
            return Integer.compare(s1, s2);
        });
        long c = 0;
        boolean[] flags = new boolean[n];
        for (int k:keys){
            if(flags[k])continue;
            HashSet<Integer> s = graph[k];
            for (int k2:s){
                if(flags[k2])continue;
                flags[k] = true;
                flags[k2] = true;
                ++c;
                break;
            }
        }
        System.out.println(c);
    }

}


