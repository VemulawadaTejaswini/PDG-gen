import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();
        
        long[] A = new long[X];
        long[] B = new long[Y];
        long[] C = new long[Z];
        
        for(int i = 0; i < X; i++){
            A[i] = sc.nextLong();
        }
        
        for(int i = 0; i < Y; i++){
            B[i] = sc.nextLong();
        }
        
        for(int i = 0; i < Z; i++){
            C[i] = sc.nextLong();
        }        
        
        reverseSort(A);
        reverseSort(B);
        reverseSort(C);
        
        PriorityQueue<CakePair> queue = new PriorityQueue<>();
        boolean[][][] isDone = new boolean[X][Y][Z];         
        queue.add( new CakePair(A[0]+B[0]+C[0], 0, 0, 0) );
        isDone[0][0][0] = true;

        long[] ans = new long[K];
        for(int i = 0; i < K; i++){
            CakePair cp = queue.poll();
            ans[i] = cp.V;
            
            int Ai = cp.Ai;
            int Bi = cp.Bi;
            int Ci = cp.Ci;
            
            if( Ai+1 < X && !isDone[Ai+1][Bi][Ci] ){
                queue.add( new CakePair(A[Ai+1]+B[Bi]+C[Ci], Ai+1, Bi, Ci) );
                isDone[Ai+1][Bi][Ci] = true;
            }
            
            if( Bi+1 < Y && !isDone[Ai][Bi+1][Ci] ){
                queue.add( new CakePair(A[Ai]+B[Bi+1]+C[Ci], Ai, Bi+1, Ci) );
                isDone[Ai][Bi+1][Ci] = true;
            }
            
            if( Ci+1 < Z && !isDone[Ai][Bi][Ci+1] ){
                queue.add( new CakePair(A[Ai]+B[Bi]+C[Ci+1], Ai, Bi, Ci+1) );
                isDone[Ai][Bi][Ci+1] = true;
            }            
        }
        
        for(long i : ans){
            System.out.println(i);
        }
        
    }
    
    static class CakePair implements Comparable<CakePair>{
        long V;
        int Ai;
        int Bi;
        int Ci;
        
        public CakePair(long V, int Ai, int Bi, int Ci){
            this.V = V;
            this.Ai = Ai;
            this.Bi = Bi;
            this.Ci = Ci;
        }
        
        // 降順
        public int compareTo(CakePair o) {
            if (this.V < o.V) return 1;
            if (this.V > o.V) return -1;
            return 0;
        }
        
    }
    
    static void reverseSort(long[] L){
        Arrays.sort(L);
        int len = L.length;
        for(int i = 0; i < len/2; i++){
            long tmp = L[i];
            L[i] = L[len-1-i];
            L[len-1-i] = tmp;
        }
    }
}
