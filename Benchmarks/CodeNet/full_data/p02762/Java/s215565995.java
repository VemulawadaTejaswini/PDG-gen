import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        String res="";
        Unionfind friend = new Unionfind(N);
        int A;
        int B;
        int[] ans = new int[N];
        int[] f = new int[N];
        for(int i=0; i<M; i++){
            A=sc.nextInt()-1;
            B=sc.nextInt()-1;
            friend.union(A, B);
            f[A]++;
            f[B]++;
        }
        for(int i=0; i<N; i++){
            ans[i] = friend.getSize(i) - f[i] - 1;
        }
        int C;
        int D;
        for(int i=0; i<K; i++){
            C=sc.nextInt()-1;
            D=sc.nextInt()-1;
            if(friend.same(C, D)){
                ans[C]--;
                ans[D]--;
            }
        }
        for(int i=0; i<N; i++){
            res = res + ans[i] + " ";
        }
        
        System.out.println(res.trim());
        
        }
     









        static class Unionfind {
		 
            private int[] data;
            private int []size;
            
            public Unionfind(int size) {
                this.data = new int [size];
                this.size = new int [size];
                for(int i = 0 ;i < size ;i++) {
                    initnode(i);
                }
                clear();
            }
            
            public void initnode(int i) {
                size[i] = 1;
            }
            
            public void clear() {
                Arrays.fill(data, -1);
            }
            
            public void union(int x , int y ) {
                if((x = root(x)) != (y = root(y))) {
                    if(data[y] < data[x]) {
                        final int t = x;
                        x = y;
                        y = t;
                    }
                    data[x] += data[y];
                    size[root(x)] += size[root(y)];
                    data[y] = x;
                }
            }
            
            public int getSize(int i) {
                return size[root(i)];
            }
            
            public int root(int x) {
                if(data[x] < 0) {
                    return x;
                }
                else {
                    return data[x] = root(data[x]);
                }
            }
            
            public boolean same(int x, int y) {
                return root(x) == root(y);
            }
            
        }
    }