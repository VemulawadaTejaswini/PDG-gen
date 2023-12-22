package coder;
import java.util.Scanner;
public class Coder {
    public static void main(String[] args) {
        // TODO code application logic here
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i = 1 ; i <= input ; i ++){
            result += i;
        }
        System.out.print(result);
    }
}
