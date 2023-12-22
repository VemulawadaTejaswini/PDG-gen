import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int xmax = -1000;
        int ymin = 1000;
        int com;
        
        for(int i = 0; i < N; i++){
            com = sc.nextInt();
            if(xmax < com){
                xmax = com;
            }
        }
        for(int i = 0; i < M; i++){
            com = sc.nextInt();
            if(ymin > com){
                ymin = com;
            }
        }
        
        if(xmax < ymin){
            System.out.println("No war");
        }else{
            System.out.println("War");
        }
    }
}