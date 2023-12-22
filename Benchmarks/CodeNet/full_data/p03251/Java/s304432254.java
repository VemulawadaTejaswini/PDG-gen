import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int maxX = sc.nextInt();
        int minY = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            maxX = Math.max(maxX, x);
        }
        
        for(int i = 0; i < M; i++){
            int y = sc.nextInt();
            minY = Math.min(minY, y);
        }
        
        if( maxX < minY ){
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
        
    }
}
