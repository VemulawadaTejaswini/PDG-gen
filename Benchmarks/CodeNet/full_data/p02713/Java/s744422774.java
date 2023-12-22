import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long a = 1, b = 1, c = 1, sum = 0;
        
        for(int i =1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k<=n; k++){
                    sum += getGCD(a,getGCD(b,c));
                }
            }
        }

        System.out.println(sum);
    }

    private static long getGCD(long a, long b){
        if(a %b == 0){
            return b;
        }
        else {
            return getGCD(a, a%b); 
        }
    }
}

