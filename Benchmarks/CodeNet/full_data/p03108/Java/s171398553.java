import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A  = new int[M];
        int[] B  = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }

        long[] res = new long[M];

        UnionFind uni = new UnionFind(N);
        res[M-1] = (long)N * (N-1)/2;
        for(int m= M-2; m >=0; m--){
            res[m] = res[m+1];
            if(uni.findLeader(A[m+1]) != uni.findLeader(B[m+1])){
                int sizeA = uni.getGroupSize(A[m+1]);
                int sizeB = uni.getGroupSize(B[m+1]);
                res[m] -= sizeA * sizeB;
                uni.connect(A[m+1],B[m+1]);
            }
        }
        for(long inconv: res)
            System.out.println(inconv);
    }

    static class UnionFind{
        int[] parent;

        UnionFind(int V){
            parent = new int[V];
            Arrays.fill(parent,-1);
        }

        int findLeader(int a){
            if(parent[a] <0) return a;
            return findLeader(parent[a]);
        }

        int getGroupSize(int a){
            int leader = findLeader(a);
            return parent[leader] *-1;
        }

        void connect(int a, int b){
            int leaderA= findLeader(a);
            int leaderB= findLeader(b);
            if(leaderA==leaderB) return;

            if(getGroupSize(leaderA) < getGroupSize(leaderB) ){
                int temp = leaderA;
                leaderA = leaderB;
                leaderB = temp;
            }
            parent[leaderA] += parent[leaderB];
            parent[leaderB] =leaderA;
            for(int i=0; i< parent.length; i++ ){// B follower becomes A group
                if(parent[i] == leaderB ){
                    parent[i] = leaderA;
                }
            }
        }


    }
}