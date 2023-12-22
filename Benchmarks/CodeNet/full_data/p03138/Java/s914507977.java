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
        
        boolean isUnderK = false;
        for(int i = binK.length()-1; i >= 0; i--){
            
            int addBit = 0;
            if( N % 2 == 0 && count1[i] == N / 2 ){
                addBit = 0;
            }else if( count1[i] > N / 2 ){
                addBit = 0;
            }else{
                addBit = 1;
            }
            
            if( !isUnderK ){
                if( addBit == 1 && binK.charAt(i) == '0' ){
                    addBit = 0;
                } else if ( addBit == 0 && binK.charAt(i) == '1' ){
                    isUnderK = true;
                }
            }
            
            sb.append(addBit);
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
