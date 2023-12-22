import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String result = "123".replace(a, "").replace(b, "");
        
        System.out.println(result);

        sc.close();
    }
}
