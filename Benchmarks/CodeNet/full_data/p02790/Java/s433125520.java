import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a == b){
            System.out.println(Math.pow(a,b));
        }else {
            int tmpA = (int)Math.pow(a,b);
            int tmpB = (int)Math.pow(b,a);
            
            if (tmpA > tmpB){
                System.out.println(tmpA);
            }else {
                System.out.println(tmpB);
            }
        }


    }
}
