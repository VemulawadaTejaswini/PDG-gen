
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;
        long B;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
        }
        long result;

        if((A >= 1 && A <= 9)&&(B >= 1 && B <= 9)){
            result = A * B;
        }else{
            result = -1;
        }


        System.out.println(result);

    }


}
