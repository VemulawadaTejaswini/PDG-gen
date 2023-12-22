
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int res = factorial(n);
        int count = 0;
        while(res != 0){
            if(res%10 == 0) {
                res %= 10;
                count += 1;
            }
            else
                break;
        }
        System.out.println(count);

    }

    public static int factorial(int a){
        return (a<2)?1:a*factorial(a-2);
    }
}