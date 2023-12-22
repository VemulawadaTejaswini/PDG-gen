import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long K = sc.nextLong();
        
        Gluttony gl = new Gluttony(N, K);
        
        for(int i = 0; i < N; i++){
            gl.A[i] = sc.nextInt();
        }
        sc.nextLine();
        for(int i = 0; i < N; i++){
            gl.F[i] = sc.nextInt();
        }
        
        System.out.println(gl.find());
    }
}

class Gluttony {
    public Integer[] A;
    public Integer[] F;
    public int N;
    public long K;

    
    public Gluttony(int N, long K){
        this.N = N;
        this.K = K;
        A = new Integer[N];
        F = new Integer[N];
    }
    
    public long find(){
        long left = -1;
        long right = 1000000000005L;
        
        sort();
        
        while(right - left > 1){
            long mid = (left + right) / 2;

            if( is(mid) ){
                right = mid;
            } else {
                left = mid;
            } 
        }
        
        return right;
    }
    
    private void sort(){
        Arrays.sort(A);
        Arrays.sort(F, Collections.reverseOrder());
    }
    
    private boolean is(long mid){
        
        long sum = 0;
        
        for(int i = 0; i < N; i++){
            sum += Math.max( A[i] - mid / F[i], 0);
        }
        
        return sum <= K;
    }
}


