import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            h[i] = scan.nextInt();
            if(h[i] > max){
                max = h[i];
            }
            if(h[i] < min){
                min = h[i];
            }
        }
        for(int i = 1; i < n - 1; i++){
            if(Math.abs(h[i] - h[i - 1]) >= 2 && Math.abs(h[i] - h[i + 2]) >= 2){
                if(h[i - 1] - h[i] > 2){
                System.out.println("No");
                System.exit(0);
                }
                if(max - min >= 2){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}