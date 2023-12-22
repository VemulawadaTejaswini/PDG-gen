import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        if (S.contains("AC") ){
            System.out.println("Yes");
        }
        else  {
            System.out.println("No");
        }
    }
}
