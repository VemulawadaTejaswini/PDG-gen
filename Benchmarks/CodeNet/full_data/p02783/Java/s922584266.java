import java.util.Scanner;
import java.io.*;

public class Main {

    public static void Main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();

        int result = h / a;
        result = (h % a) == 0 ? result : result + 1;

        System.out.println(result);
    }
}