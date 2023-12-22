import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int MAX = 2000000;
    public static int tree[] = new int[MAX];
    public static void update(int qs,int qe,int cs,int ce,int ci){
        if(cs>ce||cs>qe||qs>ce){
            return;
        }
        if(cs>=qs&&ce<=qe){
            //System.out.println(ci);
            tree[ci]++;
            return;
        }
        int mid = (cs+ce)/2;
        update(qs,qe,cs,mid,2*ci+1);
        update(qs,qe,mid+1,ce,2*ci+2);
    }
    public static void lazyPropagation(){
        for(int i=0;i<=MAX/2;i++){
            int v1 = 2*i+1;
            int v2 = 2*i+2;
            if(v1<MAX){
                tree[v1] += tree[i];
            }
            if(v2<MAX){
                tree[v2] += tree[i];
            }
        }
    }
    public static int get(int qs,int qe,int cs,int ce,int ci,int limit){
        if(cs>ce||cs>qe||qs>ce){
            return 0;
        }
        if(cs>=qs&&ce<=qe){
            if(tree[ci]==limit){
                return ce-cs+1;
            }else if(cs==ce){
                return 0;
            }
        }
        int mid = (cs+ce)/2;
        int left = get(qs,qe,cs,mid,2*ci+1,limit);
        int right = get(qs,qe,mid+1,ce,2*ci+2,limit);
        return left+right;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //int num[] = new int[100001];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            //for(int j=L;j<=R;j++){
            //    num[j]++;
            //}
            update(L,R,1,100000,0);
        }
        lazyPropagation();
        int ans = get(1,100000,1,100000,0,M );
        System.out.println(ans);
    }
}
