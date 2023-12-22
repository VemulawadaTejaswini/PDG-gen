import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // two inputs
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ave =  (int) Math.ceil((a+b)/(double)2);


        System.out.println(ave);
    }

}