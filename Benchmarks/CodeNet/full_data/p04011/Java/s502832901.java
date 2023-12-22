import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if(N<=K){
            System.out.print(N*X);
        }else{
            System.out.print(K*X+Y*(N-K));
        }
    }         
}
