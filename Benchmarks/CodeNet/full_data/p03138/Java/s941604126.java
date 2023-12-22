import java.util.*;

public class Main {
    
    static int N;
    static long[] A;
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        long K = sc.nextLong();
        long[] count1 = new long[64];
        A = new long[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextLong();
            String binA = Long.toBinaryString(A[i]);

            for(int j = 0; j < binA.length(); j++){
                if( binA.charAt(binA.length()-1-j) == '1' ) count1[j]++;
            }
        }
        
        String binK = Long.toBinaryString(K);
        StringBuilder sb = new StringBuilder();
        for(int i = binK.length()-1; i >= 0; i--){
            if( count1[i] > N / 2 ){
                sb.append("0");
            } else {
                sb.append("1");
            }
        }
        
        long X = Long.parseLong(sb.toString(), 2);
        if( K == 0 ) X = 0L;
        System.out.println(f(X));
    }
    
    static long f(long X){
        
        long sum = 0;
        for(int i = 0; i < N; i++){
            sum += X ^ A[i];
        }
        
        return sum;
    }
}
