import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int apple = scanner.nextInt();
        int pieces = scanner.nextInt();
        pieces += apple*3;
        int pie = pieces / 2;
        System.out.println(pie);
    }
}