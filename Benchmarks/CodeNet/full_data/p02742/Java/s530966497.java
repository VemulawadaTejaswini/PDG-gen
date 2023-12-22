import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {

        final Scanner scan = new Scanner(System.in);
        final String line = scan.nextLine();
        String[] cells = line.split(" ");

        int yoko = Integer.parseInt(cells[0]);
        int tate = Integer.parseInt(cells[1]);

        int ans1 = (tate / 2) * (yoko/2);
        int ans2 = (tate - (tate /2)) * (yoko/2 + 1);
        
        int ans = ans1 + ans2;

        System.out.println(ans);
        scan.close();
    }
}