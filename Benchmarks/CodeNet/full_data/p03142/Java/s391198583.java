import java.util.*;

public class Main {
    static Node[] tree;
    static ArrayDeque<Integer> que;
    static int[] clen;
    static int[] dlen;
    static int[] ff;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n-1+m][2];
        tree = new Node[n];
        que = new ArrayDeque<>();
        clen = new int[n];
        dlen = new int[n];
        ff = new int[n];
        for(int i=0; i<n; i++) tree[i] = new Node(i);
        for(int i=0; i<n-1+m; i++){
            a[i][0] = sc.nextInt() - 1;
            a[i][1] = sc.nextInt() - 1;
            tree[a[i][0]].add(a[i][1]);
            tree[a[i][1]].added(a[i][0]);
        }

        int root = 0;
        for(int i=0; i<n; i++){
            if(tree[i].nump == 0) root = i;
        }
        tree[root].calcLen(-1, 0, tree);
        // Arrays.fill(clen, -1);
        // Arrays.fill(dlen, -1);
        // clen[root] = 0;
        // que.add(root);

        // while(!que.isEmpty()){
        //     int next = que.poll();
        //     if(clen[next] > dlen[next]){
        //         tree[next].calcLen2(ff[next], clen[next], tree, que, clen, dlen, ff);
        //     }
        // }

        // tree[root].par = -1;

        // for(int i=0; i<n; i++){
        //     tree[i].searchPar(tree);
        // }

        for(int i=0; i<n; i++){
            System.out.println(tree[i].par+1);
        }
    }
}

class Node{
    public int id;
    public int numc;
    public int nump;
    public int clnum;
    public ArrayList<Integer> chi;
    public ArrayList<Integer> pars;
    public int maxlen;
    public ArrayList<Integer[]> len;
    public int par;
    public Node(int id){
        this.id = id;
        numc = 0;
        nump = 0;
        chi = new ArrayList<Integer>();
        pars = new ArrayList<Integer>();
        maxlen = -1;
        len = new ArrayList<Integer[]>();
        par = -1;
        clnum = 0;
    }

    public void add(int to){
        numc++;
        chi.add(to);
    }

    public void added(int from){
        nump++;
        pars.add(from);
    }

    public void calcLen(int from, int len, Node[] tree){
        this.len.add(new Integer[]{from, len});
        clnum++;
        if(len > maxlen){
            maxlen = len;
            par = from;
        }
        if(clnum >= nump){
            for(int i=0; i<numc; i++){
                tree[chi.get(i)].calcLen(id, maxlen+1, tree);
            }
        }
    }

    // public void calcLen2(int from, int len, Node[] tree, ArrayDeque<Integer> que, int[] clen, int[] dlen, int[] ff){
    //     this.len.add(new Integer[]{from, len});
    //     if(len > maxlen){
    //         maxlen = len;
    //         par = from;
    //         dlen[id] = maxlen;
    //         for(int i=0; i<numc; i++){
    //             int next = chi.get(i);
    //             if(clen[next] < maxlen+1){
    //                 clen[next] = maxlen+1;
    //                 ff[next] = id;
    //                 que.add(next);
    //             }
    //         }
    //     }
    // }

    // public void searchPar(Node[] tree){
    //     int mpar = -1;
    //     int min = 1000000;
    //     for(int i=0; i<nump; i++){
    //         if(tree[pars.get(i)].numc < min){
    //             min = tree[pars.get(i)].numc;
    //             mpar = pars.get(i); 
    //         }
    //     }
    //     par = mpar;
    // }
}