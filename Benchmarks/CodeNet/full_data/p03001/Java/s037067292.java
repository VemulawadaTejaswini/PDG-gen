import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int W = stdIn.nextInt();
        int H = stdIn.nextInt();
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();

        System.out.println(W*H/2.0);
        if(2*x == W && 2*y == H){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
