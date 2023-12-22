import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt(), Y = s.nextInt();
        
        if(X % Y == 0){
            System.out.println(-1);
            return;
        }
        int n = 1000000000 / X;
        for(int i = 1; i<n; i++){
            if((X * i) % Y != 0){
                System.out.println(X * i);
                break;
            }
        }
        
    }
    
}