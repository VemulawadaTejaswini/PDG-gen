import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                int n = sc.nextInt();
                long c = sc.nextLong();
                long[] xs = new long[n];
                long[] vs = new long[n];
                for(int i = 0; i < n; i++){
                    xs[i] = sc.nextLong();
                    vs[i] = sc.nextLong();
                }
                
                // ---0===|
                long max = 0;
                long left = 0;
                for(int i = 0; i < n; i++){
                    left += vs[i];
                    long right = 0;
                    
                    long v1 = left + right - xs[i];
                    long v2 = left + right - xs[i]*2;
                    max = (max>v1)?max:v1;
                    max = (max>v2)?max:v2;
                    for(int j = n-1; j > i; j--){
                        right += vs[j];
                        long value0 = right - c + xs[j];
                        long value1 = left + right - xs[i] - (c - xs[j])*2;
                        long value2 = left + right - xs[i]*2 - (c - xs[j]);
                        max = (max>value0)?max:value0;
                        max = (max>value1)?max:value1;
                        max = (max>value2)?max:value2;
                    }
                }
                System.out.println(max);
            }
        }
    }    
}