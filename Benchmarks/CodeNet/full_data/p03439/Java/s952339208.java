import java.util.*;

public class Main {
    String response;
    static Scanner sc;

    public void main() {
        int n = sc.nextInt();

        query(0);
        query(1);
        query(n - 1);

        int l = 0;
        int r = n - 1;
        int id = (l + r + 1) / 2;
        int cnt = 4;
        boolean isMen = response.equals("Male");
        while (cnt <= 20) {
            query(id);

            if (isMen == response.equals("Male")) {
                l = id + 1;
            } else {
                r = id - 1;
            }

            id = (l + r + 1) / 2;
            cnt++;
        }
    }

    private void query(int id) {
        System.out.println(id);
        System.out.flush();

        response = sc.next();
        if (response.equals("Vacant")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().main();
        sc.close();
    }
}
