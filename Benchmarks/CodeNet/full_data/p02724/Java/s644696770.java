import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int bigPoint, smallPoint;

        bigPoint = (int) (X / 500) * 1000;
        smallPoint = (int)((X % 500) / 5) * 5;

        System.out.println(bigPoint + smallPoint);
    }
}