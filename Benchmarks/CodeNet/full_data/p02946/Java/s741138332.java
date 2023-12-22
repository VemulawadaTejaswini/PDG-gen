import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int k = stdIn.nextInt(); //塗られている個数
        int x = stdIn.nextInt(); //黒確座標
        
        for(int i = x - k + 1; i <= x + k - 2; i++){
            System.out.print(i + " ");
        }
        
        System.out.println(x + k - 1);
    }
}
