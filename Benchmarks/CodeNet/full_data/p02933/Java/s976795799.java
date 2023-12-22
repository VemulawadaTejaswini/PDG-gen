import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        String input = scan.next();

        // answer
        if(num < 3200){
            System.out.println("red");
        } else {
            System.out.println(input);
        }

    }
}