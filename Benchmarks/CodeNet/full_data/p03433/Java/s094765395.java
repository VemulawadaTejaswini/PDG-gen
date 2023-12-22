import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.valueOf(sc.nextLine());
        final int a = Integer.valueOf(sc.nextLine());
        if(n%500 <= a) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }       
}