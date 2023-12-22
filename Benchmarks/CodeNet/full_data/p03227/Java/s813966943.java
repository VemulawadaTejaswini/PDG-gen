import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (n.length() == 2) {
            System.out.println(n);
        } else {
                System.out.print(n.substring(2, 3 ));
                System.out.print(n.substring(1, 2 ));
                System.out.print(n.substring(0, 1 ));
                System.out.println("");

        }


    }

}