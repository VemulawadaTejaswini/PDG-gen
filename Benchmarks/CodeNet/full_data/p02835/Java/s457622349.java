import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1 + num2 + num3 >= 22){
            System.out.println("bust");
        }
        else {
            System.out.println("win");
        }
    }
}