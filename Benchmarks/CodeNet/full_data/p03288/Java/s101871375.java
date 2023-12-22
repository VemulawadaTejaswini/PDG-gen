import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 1200){
            System.out.print("ABC");
        }else if (num < 2800){
            System.out.print("ARC");
        }else {
            System.out.print("AGC");
        }
    }
}
