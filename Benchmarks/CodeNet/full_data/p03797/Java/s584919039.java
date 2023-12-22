
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner Input = new Scanner(System.in);
        long N = Input.nextLong();
        long M = Input.nextLong();
        long C = M/2;
        C = (C+N)/2;
        System.out.println(C);                      
    }
}
