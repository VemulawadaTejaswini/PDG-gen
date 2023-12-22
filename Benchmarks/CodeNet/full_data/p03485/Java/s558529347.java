import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println((int)((scanner.nextInt() + scanner.nextInt()) / 2.0D) + 1);
    }
}