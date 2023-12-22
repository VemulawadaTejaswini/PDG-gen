import java.util.*;

public class Main {
    static Scanner sc;

    public void main() {
        int n = sc.nextInt();

        String left = query(0);
        String right = query(n - 1);

        int l = 0;
        int r = n - 1;
        while (true) {
            int id = (l + r) / 2;
            String tmp = query(id);

            if (((r - id) % 2 == 0) == (tmp.equals(right))) {
                r = id;
                right = tmp;
            } else {
                l = id;
                left = tmp;
            }
        }
    }

    private String query(int id) {
        System.out.println(id);
        System.out.flush();

        String response = sc.next();
        if (response.equals("Vacant")) {
            System.exit(0);
        }

        return response;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().main();
        sc.close();
    }
}
