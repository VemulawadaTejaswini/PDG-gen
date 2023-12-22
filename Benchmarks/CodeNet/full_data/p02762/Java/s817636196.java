import java.util.*;

public class Main {
    static int max = 100000;
    static int[] stack = new int[max];
    static int top = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        TreeMap<Integer,TreeSet<Integer>[]> relation = new TreeMap<>();
        for (int i=1;i<=n;i++){
            relation.put(i,new TreeSet[2]);
            relation.get(i)[0] = new TreeSet<>();
            relation.get(i)[1] = new TreeSet<>();
        }
        for (int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            relation.get(a)[0].add(b);
            relation.get(b)[0].add(a);
        }
        for (int i=0;i<k;i++){
            int c = sc.nextInt();
            int d = sc.nextInt();
            relation.get(c)[1].add(d);
            relation.get(d)[1].add(c);
        }
        boolean[] done = new boolean[n+1];
        HashSet<Integer>[] con = new HashSet[n+1];
        for (int i=1;i<=n;i++)done[i]=false;
        for (int i=1;i<=n;i++){
            init();

            if (!done[i]){
                HashSet<Integer> hash = new HashSet<>();
                hash.add(i);
                boolean[] seen = new boolean[n+1];
                for (int j=1;j<=n;j++)seen[i]=false;
                push(i);
                seen[i]=true;
                while (!isEmpty()){
                    int v = pop();
                    for (int l : relation.get(v)[0]){
                        if (!seen[l]){
                            seen[l]=true;
                            push(l);
                            hash.add(l);
                        }
                    }
                }
                for (int a : hash){
                    con[a]= new HashSet<>();
                    con[a].addAll(hash);
                    done[a]=true;
                }
            }
            con[i].removeAll(relation.get(i)[1]);
            System.out.print((con[i].size()-relation.get(i)[0].size()-1)+" ");
        }
        System.out.println();
    }
    static void init(){top=0;}
    static boolean isEmpty(){return (top==0);}
    static boolean isFull(){return (top==max);}

    static void push(int v){
        if (isFull()){
            System.out.println("error: stack is full.");
            return;
        }
        stack[top++] = v;
    }
    static int pop(){
        if (isEmpty()){
            System.out.println("error: stack is empty");
            return -1;
        }
        return stack[--top];
    }
}
