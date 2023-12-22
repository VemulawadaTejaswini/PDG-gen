import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();  
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        
        ArrayList<Integer>[] nb = new ArrayList[N+1];
        for(int i = 1; i < N+1; i++)
            nb[i] = new ArrayList<>();
            
        for(int i = 0; i < M; i++){
            int u, v;
            {int[] a = r.ii(); u = a[0]; v = a[1];}
            nb[u].add(v);
        }
        
        ArrayList<Integer>[] next = new ArrayList[N+1];
        for(int i = 1; i < N+1; i++){
            ArrayList<Integer> A = new ArrayList<>();
            A.add(i);
            for(int j = 0; j < 3; j++){
                HashSet<Integer> hs = new HashSet<>();
                for(int a : A)
                    hs.addAll(nb[a]);
                A.clear();
                A.addAll(hs);
            }
            next[i] = A;
        }

        int S, T;
        {int[] a = r.ii(); S = a[0]; T = a[1];}
        int[] d = new int[N+1];
        final int INF = Integer.MAX_VALUE;
        Arrays.fill(d, INF);        
        Heap A = new Heap(new ArrayList<Integer>(), d);
        d[S] = 0;
        A.add(S, d);
        while(A.size()>0){
            int v = A.getMin();
            if(v == T){
                println(d[v]);
                return;
            }
            for(int w : next[v]){
                if(d[w] == INF){
                    d[w] = d[v] + 1;
                    A.add(w, d);
                } else if(d[w] > d[v] + 1)
                    d[w] = d[v] + 1;                
            }                      
        }  
        println(-1);
    }

    static void print(Object o){
        System.out.print(o.toString());
    }

    static void println(Object o){
        System.out.println(o.toString());
    }

    static int Int(String s){
        return Integer.parseInt(s);
    }

    static long Long(String s){
        return Long.parseLong(s);
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        long l() throws IOException{
            return Long(s());
        }

        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
    static class Heap{
        private ArrayList<Integer> list;
        private int size;
        private int[] d;

        // Heapのインスタンスでヒープ構造を保持する
        public Heap(ArrayList<Integer> arrayList, int[] d){
            list = arrayList;
            size = list.size();
            this.d = d;
        }

        // どちらか選ぶ
        public void sort(){
            loopSort(); // 非再帰
            // recursiveSort(); // 再帰
        }

        /* 非再帰的ソート
         * parentは着目しているノードのindex
         * left, rightはparentの子のindex
         * childはleft, rightのより小さいほうのindex
         */
        private void loopSort(){
            for(int parent = size/2-1; 0 <= parent; parent--){ // 子を持つノードから頂点までの繰り返し
                int left = 2*parent + 1;
                while(left < size){
                    int right = left + 1,
                    child = left;
                    if(right < size && d[list.get(right)] < d[list.get(left)]){
                        child = right;
                    }
                    if(d[list.get(child)] < d[list.get(parent)]){
                        swap(parent, child);
                        left = 2*child + 1;
                    } else{
                        break;
                    }
                }
            }
        }

        // 再帰的ソート
        public void recursiveSort(){
            heapify(0);
        }

        /* leftを頂点とする2分木とrightを頂点とする2分木をheapifyで再帰的にソートする
         * そのあとparentとchildを比べる
         * もしswapしたらchildを頂点とする2分木をさらにheapifyで再帰的にソートする
         */
        private void heapify(int parent){
            int left = 2*parent + 1,
            right = left + 1,
            child = left;
            if(left < size){
                heapify(left);
                if(right < size){
                    heapify(right);
                    if(d[list.get(right)] < d[list.get(left)]){
                        child = right;
                    }
                }
                if(d[list.get(child)] < d[list.get(parent)]){
                    swap(parent, child);
                    heapify(child);
                }
            }
        }

        //indexがxとyの要素を入れ替える
        private void swap(int x, int y){
            int z = list.get(x);
            list.set(x, list.get(y));
            list.set(y, z);
        }

        // ヒープの頂点を取り出す
        public int getMin(){
            int min = list.get(0);
            remove(0);
            return min;
        }

        // indexの要素をヒープから削除し、ヒープを再構築する
        public void remove(int index){
            list.set(index, list.get(size-1));
            list.remove(size-1);
            size--;
            sort();
        }

        // ヒープの要素数を返す
        public int size(){
            return size;
        }

        // ヒープに要素を追加する
        public void add(int v, int[] d){
            list.add(v);
            size++;
            this.d = d;
            sort();        
        }

    }
}

