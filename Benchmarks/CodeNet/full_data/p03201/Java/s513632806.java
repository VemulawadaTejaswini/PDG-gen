import java.util.*;

public class Main {
    static int dp[][];
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
        HashMap<Integer,HashSet<Integer>> graph = new HashMap<>();
        for (int i = 0;i < a.length;++i){
            for (int j = 0;j <= 32;++j){
                long t = (2L << j) - a[i];
                if(mapA.containsKey(t)){
                    if(!graph.containsKey(i))graph.put(i, (HashSet<Integer>)mapA.get(t).clone());
                    else graph.get(i).addAll((HashSet<Integer>)mapA.get(t).clone());
                }
            }
        }
        for (int i:graph.keySet()){
            graph.get(i).remove(i);
        }
        ArrayList<Integer> keys = new ArrayList<>(graph.keySet());
        keys.sort((i1,i2) -> {
            int s1 = graph.get(i1).size();
            int s2 = graph.get(i2).size();
            return Integer.compare(s1, s2);
        });
        long c = 0;
        boolean[] flags = new boolean[n];
        for (int k:keys){
            if(flags[k])continue;
            HashSet<Integer> s = graph.get(k);
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


