import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int K = s.nextInt();
        double res = (double)0;
        
        for(int i = 0;i < N;i++){
            if(K > i){
                res = res + (1 / (double)N) * (Math.pow(0.5 , Math.ceil(Math.log(K / (i + 1)) / Math.log(2))));
            }else{
                res = res + 1 / (double)N;
            }
        }
        
        System.out.println(res);


    }
}
