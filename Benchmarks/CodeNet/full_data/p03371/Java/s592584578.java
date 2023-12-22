import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();

        if(c - 0.5 * a - 0.5 * b > 0){
            System.out.println(a * x + b * y);
        }else{
            if(x < y){
                if(b * (y - x) + 2 * c * x <= 2 * c * y){
                    System.out.println(b * (y - x) + 2 * c * x);
                }else{
                    System.out.println(2 * c * y);
                }
            }else{
                if(a * (x - y) + 2 * c * y <= 2 * c * x){
                    System.out.println(a * (x - y) + 2 * c * y);
                }else{
                    System.out.println(2 * c * x);
                }
            }
        }
    }
}