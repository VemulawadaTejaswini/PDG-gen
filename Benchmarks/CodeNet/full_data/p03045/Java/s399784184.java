import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        int n,m;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer(br.readLine());
        n=Integer.parseInt(in.nextToken());
        m=Integer.parseInt(in.nextToken());
        in=null;
        Union_Find tree=new Union_Find(n);
        for(int i=0;i<m;i++){
            in=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(in.nextToken()),b=Integer.parseInt(in.nextToken());
            in=null;
            tree.Union(a,b);
            a=null;b=null;
        }
        m=null;
        br=null;
        System.out.println(tree.get_tree(n));
    }
}
class Union_Find{
    private int[] t,s;
    public Union_Find(int max_length){
        t=new int[max_length];
        s=new int[max_length];
        for(int i=0;i<max_length;i++){
            t[i]=i;
            s[i]=1;
        }
    }
    void Union(int x,int y){
        x--;y--;
        if (same(x, y)) return;
        int tx = Find(x), ty = Find(y);
        if (s[tx] < s[ty]) {
            s[ty] += s[tx];
            t[tx] = ty;
        }
        else if (s[tx] > s[ty]) {
            s[tx] += s[ty];
            t[ty] = tx;
        }
        else if (tx > ty) {
            t[tx] = ty;
            s[ty] += s[tx];
        }
        else {
            t[ty] = tx;
            s[tx] += s[ty];
        }
    }
    int Find(int n) {
        if (t[n] == n)
            return n;
        else
            return t[n] = Find(t[n]);
    }
    boolean same(int x, int y) {
        return Find(x-1) == Find(y-1);
    }
    int get_Size(int a) {
        return s[a-1];
    }
    int get_tree(int size){
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<size;i++){
            st.add(Find(i));
        }
        return st.size();
    }
}
