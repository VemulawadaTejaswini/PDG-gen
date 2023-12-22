import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n = X;
        int a =0;
        int sum = 0;

        while (n > 0){
            a = n % 10;
            n =n / 10;
            sum = sum + a;
        }

        if(X % sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
