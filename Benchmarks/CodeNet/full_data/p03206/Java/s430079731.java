import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int day = scan.nextInt();

        // answer
        System.out.print("Christmas");
        for(int i = 0; i < 25 - day; i++){
            System.out.print(" Eve");
        }
        System.out.println("");

    }
}