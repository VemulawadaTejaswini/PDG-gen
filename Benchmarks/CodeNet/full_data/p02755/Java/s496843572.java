import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");
        double A = Double.parseDouble(S[0]);
        double B = Double.parseDouble(S[1]);
        sc.close();

        double temp = Math.floor(A / 0.08);

        double temp2 = Math.floor(temp * 0.1);

        if (temp2 == B) {
            System.out.println((long) temp);
        } else {
            System.out.println("-1");
        }
    }

}
