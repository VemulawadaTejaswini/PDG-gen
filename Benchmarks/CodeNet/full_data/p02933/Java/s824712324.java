import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String s = sc.next();

        if (a < 3200) {
        	s = "red";
        }

        System.out.println(s);

    }

}
