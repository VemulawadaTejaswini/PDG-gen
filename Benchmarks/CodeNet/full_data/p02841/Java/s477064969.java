import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] md1 = sc.nextLine().split(" ");
        String[] md2 = sc.nextLine().split(" ");
        int m1 = Integer.parseInt(md1[0]);
        int m2 = Integer.parseInt(md2[0]);
        if (m1 == m2) {
            System.out.println("0");
        } else {
            System.out.println("1");
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