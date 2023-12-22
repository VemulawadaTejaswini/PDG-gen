import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 9; k++) {
                set.add(i * k);
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (set.contains(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
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
