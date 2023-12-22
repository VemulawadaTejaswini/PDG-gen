
import java.util.*;



public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        ints=new int[N];
        UnionFind unionFind=new UnionFind(N);
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
            if(!unionFind.isActive(ints[i]-2)){
                unionFind.doActive(ints[i]-1);
                continue;
            }else{
                unionFind.union(ints[i]-1,ints[i]-2);
                unionFind.doActive(ints[i]-1);
            }
        }
        System.out.println(N-unionFind.maxLength());
    }

}
class UnionFind{
    int[] parents;
    boolean[] actives;
    int[] lengths;
    public UnionFind(int n){
        parents=new int[n];
        for(int i=0;i<n;i++){
            parents[i]=i;
        }
        actives=new boolean[n];
        lengths=new int[n];
        for(int i=0;i<n;i++){
            lengths[i]=1;
        }
    }
    int parent(int x){
        if(parents[x]==x){
            return x;
        }else{
            return parent(parents[parents[x]]);
        }
    }
    void doActive(int x){
        actives[x]=true;
    }
    boolean isActive(int x){
        if(x==-1) return false;
        return actives[x];
    }
    void union(int x,int y){
        parents[x]=y;
        lengths[x]=lengths[y]+1;
    }
    int length(int x){
        int result=1;
        while(parents[x]!=x){
            result++;
            x=parents[x];
        }
        return result;
    }
    int maxLength(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<parents.length;i++){
            int len=lengths[i];
            if(max<len) max=len;
        }
        return max;
    }
}