
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;


        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();

        }
        boolean flg = false;
        for (int i = 1; i < 10; i++) {
            if(A%i == 0 && A/i >= 1 && A/i <=9){
                flg = true;
            }

        }


        if(flg){
            System.out.println("Yes");
        }else{
            System.out.println("No");

        }

    }


}
