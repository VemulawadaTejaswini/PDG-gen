import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        System.out.println((age == 7 || age == 5 || age == 3?"YES":"NO"));
    }
}
