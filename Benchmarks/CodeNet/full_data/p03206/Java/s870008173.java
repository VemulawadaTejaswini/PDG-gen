import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 25){
            System.out.println("Christmas");
        }else if (n == 24){
            System.out.println("Christmas Eve");
        }else if (n == 23){
            System.out.println("Christmas Eve Eve");
        }else {
            System.out.println("Christmas Eve Eve Eve");
        }

    }

}
