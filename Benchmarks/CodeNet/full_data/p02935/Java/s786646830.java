import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] v = sc.nextLine().split(" ");
        ArrayList<Integer> iv = new ArrayList<>();
        for (String sv : v) {
            iv.add(Integer.parseInt(sv));
        }
        Collections.sort(iv);
        double result = iv.remove(0);
        for (int i : iv) {
            result = (result + i) / 2;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
