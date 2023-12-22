import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int Y = X / 500;
        int Z = (X-Y*500)/5;





        System.out.println( Y*1000 + Z*5 );
    }