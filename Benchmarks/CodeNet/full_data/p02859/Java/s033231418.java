import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int r = Integer.parseInt(line); 
        //半径×半径×3.14
        System.out.println(r * r);
    }
}