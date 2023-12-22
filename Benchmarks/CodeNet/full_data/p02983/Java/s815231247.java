import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long L = sc.nextLong();
        long R = sc.nextLong();

        sc.close();
        
        int min = 2019;

        if(R-L > 2018){
            min = 0;
        }else{
         for(long i = L; i <= R-1; i++){
             for(long j= i+1; j <= R; j++){
                 long tmp = i*j%2019;
                 min = (int) Math.min(tmp, min);
             }
         }
        }
        System.out.println(min);
    }
}