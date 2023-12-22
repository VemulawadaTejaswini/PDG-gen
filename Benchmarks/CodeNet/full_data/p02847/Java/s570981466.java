import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(str.equalsIgnoreCase("SUN")) {
            System.out.print(7);
        } else if(str.equalsIgnoreCase("MON")) {
            System.out.print(6);
        } else if(str.equalsIgnoreCase("TUE")) {
            System.out.print(5);
        } else if(str.equalsIgnoreCase("WED")) {
            System.out.print(4);
        } else if(str.equalsIgnoreCase("THU")) {
            System.out.print(3);
        } else if(str.equalsIgnoreCase("FRI")) {
            System.out.print(2);
        } else if(str.equalsIgnoreCase("SAT")) {
            System.out.print(1);
        }


    }
}