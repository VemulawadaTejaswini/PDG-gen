import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x != 3 && x != 5 && x != 7)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}







