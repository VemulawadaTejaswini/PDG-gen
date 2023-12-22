import java.util.*;

public class Main {

    static class Trio implements Comparable<Trio>{
        int idx=0;
        List<Integer> adj=new ArrayList<>();
        Trio(int idx , int idxAdj){
            this.idx = idx;
            this.adj.add(idxAdj);
        }
        //add adjacent
        void add(int idx){
            adj.add(idx);
        }
        @Override
        public int compareTo(Trio o) {
            int xd =  o.adj.size() - this.adj.size();
            int sd = this.idx - o.idx;
             return xd != 0 ? xd :sd;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap<Integer,Trio> map = new HashMap<>();
        for (int i = 0; i < N-1; i++) {
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            if(!map.containsKey(i1)){
                Trio t = new Trio(i1,i2);
                map.put(i1,t);
            }else{
                map.get(i1).add(i2);
            }
            if(!map.containsKey(i2)){
                Trio t = new Trio(i2,i1);
                map.put(i2,t);
            }else{
                map.get(i2).add(i1);
            }
        }
        TreeSet<Trio> tm = new TreeSet();
        for(Map.Entry<Integer,Trio> e: map.entrySet()){
            tm.add(e.getValue());
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }

        SortedMap<Integer,Integer> ans = new TreeMap<>();

        int sum =0;
        while(!pq.isEmpty()){
            Trio top = tm.pollFirst();//highest degree
            int idx = top.idx;
            if(!ans.containsKey(idx)){
                int val = pq.poll();
                ans.put(idx,val);
                List<Integer> adjs = top.adj;
                for(Integer adjId : adjs){
                    if(!ans.containsKey(adjId)){
                        int val2 = pq.poll();
                        ans.put(adjId,val2);
                        sum+=val2;
                    }else{
                        sum+=val;
                    }
                }
            }
        }

        System.out.println(sum);
        for (Map.Entry<Integer,Integer> e : ans.entrySet()){
            System.out.print(e.getValue()+" ");
        }
    }
}
