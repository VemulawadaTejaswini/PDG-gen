import java.util.*;

public class Main {
    static int max = 1000000;
    static int[] queue = new int[max];
    static int tail = 0; static int head = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i=0;i<h;i++){
            String ss = sc.next();
            for (int j=0;j<w;j++)s[i][j]=ss.charAt(j);
        }
        HashMap<Integer,HashSet<Integer>> graph = new HashMap<>();
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                HashSet<Integer> hash = new HashSet<>();
                if (s[i][j]=='.'){
                    if (i!=h-1){
                        if (s[i+1][j]=='.')hash.add((i+1)*100+j);
                    }
                    if (i!=0){
                        if (s[i-1][j]=='.')hash.add((i-1)*100+j);
                    }
                    if (j!=w-1){
                        if (s[i][j+1]=='.')hash.add(i*100+j+1);
                    }
                    if (j!=0){
                        if (s[i][j-1]=='.')hash.add(i*100+j-1);
                    }
                }
                graph.put(100*i+j,hash);
            }
        }
        int ans = 0;
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                boolean[][] seen = new boolean[h][w];
                for (int a=0;a<h;a++)for (int b=0;b<w;b++)seen[a][b]=false;
                enqueue(100*i+j);
                seen[i][j]=true;
                int[][] local = new int[h][w];
                while (!isEmpty()){
                    int v = dequeue();
                    for (int ins : graph.get(v)){
                        if (!seen[ins/100][ins%100]){
                            enqueue(ins);
                            seen[ins/100][ins%100]=true;
                            local[ins/100][ins%100]=local[v/100][v%100]+1;
                        }
                    }
                }
                int LOCAL = 0;
                for (int y=0;y<h;y++){
                    Arrays.sort(local[y]);
                    LOCAL=Math.max(local[y][w-1],LOCAL);
                }
                ans = Math.max(ans,LOCAL);
            }
        }
        System.out.println(ans);
    }


    static void init(){head = 0; tail = 0;}
    static boolean isEmpty(){return (head==tail);}
    static boolean isFull(){return (head == (tail+1)%max);}
    static public void enqueue(int v){
        if (isFull()){
            System.out.println("error: queue is full.");
            return;
        }
        queue[tail++] = v;
        if (tail == max) tail = 0;
    }
    static public int dequeue(){
        if (isEmpty()){
            System.out.println("error: queue is empty");
            return -1;
        }
        int res = queue[head];
        ++head;
        if (head == max) head = 0;
        return res;
    }

}
