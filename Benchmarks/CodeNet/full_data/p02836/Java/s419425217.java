import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1, s2;
        if (s.length() % 2 == 0) {
            s1 = s.substring(0, s.length() / 2);
            s2 = s.substring(s.length() / 2);
        } else {
            s1 = s.substring(0, (s.length() - 1) / 2);
            s2 = s.substring((s.length() / 2) + 1);
        }
        s2 = new StringBuffer(s2).reverse().toString();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}