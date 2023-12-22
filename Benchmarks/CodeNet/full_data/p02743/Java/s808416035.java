import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] cells = line.split(" ");

        long val1 = Long.parseLong(cells[0]);
        long val2 = Long.parseLong(cells[1]);
        long val3 = Long.parseLong(cells[2]);

        if (Math.sqrt(val1) + Math.sqrt(val2) < Math.sqrt(val3) ) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scan.close();
    }
}