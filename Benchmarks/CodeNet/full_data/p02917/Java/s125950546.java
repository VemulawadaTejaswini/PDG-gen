import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] b = sc.nextLine().split(" ");
        int maxTotal = Integer.parseInt(b[0]);
        for (int idx = 0; idx < (n - 1); idx++) {
            maxTotal += Integer.parseInt(b[idx]);
        }
        System.out.println(maxTotal);
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}