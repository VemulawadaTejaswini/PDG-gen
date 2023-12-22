import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int sum = a+b+c;
        if(sum>=22){
            System.out.println("bust");
        }
        else{
            System.out.println("win");
        }
    }
}