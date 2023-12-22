import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int sum = 0;
        for (String sa : a) {
            sum += Integer.parseInt(sa);
        }
        if (sum <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
