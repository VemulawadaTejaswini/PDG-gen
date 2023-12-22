import java.util.Scanner;

public class InputSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
      	int n = 0;
        if ( 2 ^ n <= N ) {
          n = n + 1;
        } else {
          System.out.println(2^n);
        }   
    }
}