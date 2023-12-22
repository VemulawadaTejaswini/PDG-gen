import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[M];
        int xmax = -1000;
        int ymin = 1000;
        
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < M; i++){
            y[i] = sc.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            if(xmax < x[i]){
                xmax = x[i];
            }
        }
        for(int i = 0; i < M; i++){
            if(ymin > y[i]){
                ymin = y[i];
            }
        }
        
        if(xmax < ymin && X < ymin && xmax <= Y){
            System.out.println("No war");
        }else{
            System.out.println("War");
        }
    }
}