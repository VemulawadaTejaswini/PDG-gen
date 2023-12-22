import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {

        final Scanner scan = new Scanner(System.in);
        final String line = scan.nextLine();
        String[] cells = line.split(" ");

        long val1 = Long.parseLong(cells[0]);
        long val2 = Long.parseLong(cells[1]);
        long val3 = Long.parseLong(cells[2]);

        double a = Math.sqrt(val1) ;
        double b = Math.sqrt(val2) ;
        double c = Math.sqrt(val3) ;

        if (a + b < c) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scan.close();
    }
}