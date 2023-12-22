import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(sc.next());
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= 100; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += (x[j] -i)*(x[j] -i);
            }
            if(sum < min) min = sum;
        }
        System.out.println(min);
    }
}