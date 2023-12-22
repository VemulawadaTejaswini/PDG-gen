import java.util.Scanner;

public class Main {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);              //Scannerを初期化

        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(socketCalc(a, b));




    }
    public static int socketCalc(int a, int b) {
        int count = 0;
        int socketAmount = 1;

        while(socketAmount < b) {
            socketAmount += (a - 1);
            count++;
        }
        return count;
    }
}
