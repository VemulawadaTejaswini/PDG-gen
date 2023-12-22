import java.util.Scanner;
class Main{
    public static void main{
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int x = round(X + Y/2);
        System.out.println(x);
    }
}