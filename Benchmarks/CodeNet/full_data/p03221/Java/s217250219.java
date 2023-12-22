import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<int[]>[] map = new ArrayList[n+1];
        for(int i=0;i<=n;i++) map[i] = new ArrayList<>();
        for(int i=1;i<=m;i++){
            int p = sc.nextInt();
            int y = sc.nextInt();
            map[p].add(new int[]{y,i});
        }
        PriorityQueue<Node> res = new PriorityQueue<>();

        for(int i=1;i<=n;i++){
            if(map[i].size()==0) continue;
            Collections.sort(map[i],new myc());
            for(int j=0;j<map[i].size();j++){
                String s = getName(i,j+1);
                res.add(new Node(s,map[i].get(j)[1]));
            }
        }
        while(res.size()>0){
            System.out.println(res.poll().s);
        }
    }
    static String getName(int idx, int p){
        String IDX = Integer.toString(idx);
        String P = Integer.toString(p);
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<6-IDX.length();i++) ans.append(0);
        ans.append(IDX);
        for(int i=0;i<6-P.length();i++) ans.append(0);
        ans.append(P);
        return ans.toString();
    }
    static class myc implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            return a[0]-b[0];
        }
    }
    static class Node implements Comparable<Node>{
        String s;
        int id;
      public Node(String s_, int id_){
            this.s = s_;
            this.id = id_;
        }
        public int compareTo(Node e){return this.id-e.id;}
    }
}
