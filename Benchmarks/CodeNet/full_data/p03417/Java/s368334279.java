import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();

        if(N == 1 || M == 1){
            System.out.println(N + M - 3);
        } else if(N == 2 || M == 2){
            System.out.println(0);
        } else{
            System.out.println( (N - 1) * (M - 1));
        }
    }
}
