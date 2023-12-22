import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long[] clocks = new long[n];
        for(int i = 0; i < n; i++){
            clocks[i] = Long.parseLong(sc.nextLine());
        }
        Arrays.sort(clocks);
        
        if(n >= 1 && n <= 100){
            for(int i = 0; i < n; i++){
                if(!(clocks[i] <= (long)Math.pow(10, 18) && clocks[i] >= 1))
                    return;
            }
            
            if(n == 1)
                System.out.println(clocks[0]);
            else{
                long max = clocks[n-1];
                for(int i = 0; i < n - 1; i++){
                    if(!(max % clocks[i] == 0))
                        max *= clocks[i];
                }
                if(max <= (long)Math.pow(10, 18))
                   System.out.println(max);
            }
        }
    }
}
