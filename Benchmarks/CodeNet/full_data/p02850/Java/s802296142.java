import java.util.*;


public class Main {
    static int max = 1000000;
    static int[] queue = new int[max];
    static int tail = 0; static int head = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,HashSet<Integer>> graph = new HashMap<>();
        for (int i=1;i<=n;i++)graph.put(i,new HashSet<>());
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i=1;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
            A[i]=a;
            B[i]=b;
        }
        boolean[] seen = new boolean[n+1];
        int[] color = new int[n+1];
        color[1]=0;
        for (int i=1;i<=n;i++)seen[i]=false;
        enqueue(1);
        seen[1]=true;
        HashMap<String,Integer> ans = new HashMap<>();
        int max = 0;
        while (!isEmpty()){
            int v = dequeue();
            int count = 1;
            for (int i : graph.get(v)){
                if (!seen[i]){
                    seen[i]=true;
                    enqueue(i);
                    if (count==color[v])count++;
                    color[i]=count;
                    ans.put(v+"+"+i,count);
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        System.out.println(max-1);
        for (int i=1;i<n;i++){
            if (!ans.containsKey(A[i]+"+"+B[i])){
                System.out.println(ans.get(B[i]+"+"+A[i]));
            }else {
                System.out.println(ans.get(A[i]+"+"+B[i]));
            }
        }
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
