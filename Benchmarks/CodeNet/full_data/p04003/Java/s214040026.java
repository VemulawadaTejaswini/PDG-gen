import java.util.*;

public class Main{
    static ArrayList<ArrayList<Integer[]>> graph;
    static HashMap<Long, Integer> idMap;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList();
        idMap = new HashMap<Long, Integer>();
        for(int i=0; i<m; i++){
            int p = sc.nextInt()-1;
            int q = sc.nextInt()-1;
            int c = sc.nextInt()-1;
            int pId = getId(p, c);
            int qId = getId(q, c);
            graph.get(pId).add(new Integer[]{qId, 0});
            graph.get(qId).add(new Integer[]{pId, 0});
        }
        getId(n-1, -1);
        sc.close();
        if(m == 0){
            System.out.println(-1);
            return;
        }

        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
        int[] len = new int[idMap.size()];
        Arrays.fill(len, -1);
        len[0] = 0;
        que.add(getId(0, -1));
        while(!que.isEmpty()){
            int current = que.poll();
            for(Integer[] next : graph.get(current)){
                if(len[next[0]] == -1){
                    que.add(next[0]);
                    len[next[0]] = len[current] + next[1];
                }
            }
        }

        System.out.println(len[getId(n-1, -1)]);
    }

    public static int getId(long station, long company){
        long tmpId = company * 10000000 + station;
        int id;
        if(!idMap.containsKey(tmpId)){
            idMap.put(tmpId, id = idMap.size());
            graph.add(new ArrayList<Integer[]>());
            graph.get(id).add(new Integer[]{getId(station, -1), 0});
            graph.get(getId(station, -1)).add(new Integer[]{id, 1});
        }else{
            id = idMap.get(tmpId);
        }
        return id;
    }
}