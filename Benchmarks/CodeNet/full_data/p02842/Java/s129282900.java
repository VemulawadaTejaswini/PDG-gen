import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        double x = Math.ceil(n / 1.08d);
        double nn = Math.floor(x * 1.08);
        if (n == nn) {
            System.out.printf("%.0f%n", x);
        } else {
            System.out.println(":(");
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