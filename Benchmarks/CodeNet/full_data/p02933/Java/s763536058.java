import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float result = 0;
        try {
            int N = Integer.parseInt(br.readLine());
            int v;
            int save = 1;
            int box[] = new int[N];
            for (int i=0; i<N ; i++) {
                v = Integer.parseInt(br.readLine());
                box[i] = v;
                save = save*v/gcd(save,v);
            }
            
            int denomi = 0;
            int nume = 1;
            for (int j=0; j<N ; j++) {
            		denomi += save/box[j];
            		nume = nume*box[j];
            }
            
            result = nume/denomi;
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println(result);
    }
    
    private static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}