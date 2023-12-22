import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        
        int[] x = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
        }
        
        int cost = 0, min = 100000;
        for(int i = 0; i <= 100; i++) {
            cost = 0;
            for(int j = 0; j < n; j++) {
                cost += (x[j]-i)*(x[j]-i);
            }
            if(cost < min) {
                min = cost;
            }
        }
        
        System.out.println(min);
    }
}