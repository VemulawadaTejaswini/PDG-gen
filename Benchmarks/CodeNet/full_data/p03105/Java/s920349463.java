import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // answer
        System.out.println(Math.min(b / a, c));

    }
}