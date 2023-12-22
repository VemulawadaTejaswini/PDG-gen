import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        if (n >= 3200) {
            System.out.println(s);
        } else {
            System.out.print("red");
        }
    }

}
