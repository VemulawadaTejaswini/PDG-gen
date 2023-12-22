import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        char[] t = sc.nextLine().toCharArray();

        boolean isAllFound = true;
        ArrayList<Character> checkList = new ArrayList<>();
        for (char c : s) {
            checkList.add(c);
        }
        for (char c : t) {
            if (!checkList.contains(c)) {
                isAllFound = false;
                break;
            }
        }
        if (!isAllFound) {
            System.out.println("-1");
            return;
        }

        double count = 0;
        int tidx = 0;
        while (tidx != t.length && count != Math.pow(10, 100)) {
            for (char check : s) {
                if (tidx == t.length || count == Math.pow(10, 100)) break;
                count += 1;
                if (t[tidx] == check) {
                    tidx += 1;
                }
            }
        }
        System.out.println((int)count);
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
