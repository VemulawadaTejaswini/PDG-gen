import java.util.*;

public class Main {

    public static void printX(int n){
        if(n <= 1000000 && n >= -1000000){
            System.out.print(n);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = 2000001;

        int K = sc.nextInt();
        int X = sc.nextInt();

        for(int i = X - K + 1; i <= X; i++){
            printX(i);
            System.out.print(" ");
        }

        for(int i = X+1; i < X + K; i++){
            printX(i);
            if(i != X + K -1){
                System.out.print(" ");
            }
        }


    }
}