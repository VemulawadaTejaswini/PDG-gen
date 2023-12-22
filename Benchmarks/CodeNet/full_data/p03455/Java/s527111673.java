import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m*n%2==0){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }

}
