import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] clocks = new int[n];
        for(int i = 0; i < n; i++){
            clocks[i] = Integer.parseInt(sc.nextLine());
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
                int max = clocks[n-1] * clocks[n-2];
                for(int i = 0; i < n - 2; i++){
                    if(!(max % clocks[i] == 0))
                        max *= clocks[i];
                }
                if(max <= (long)Math.pow(10, 18))
                   System.out.println(max);
            }
        }
    }
}
