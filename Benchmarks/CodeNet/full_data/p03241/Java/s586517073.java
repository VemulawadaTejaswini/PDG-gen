import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] nm = line.split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int num = m/n;
        int rel = 2;
        for (int i = 2; i <= num/2; i++) {
            if (num%i == 0) {
                rel = i;
            }
        }
        System.out.println(rel);
        sc.close();
    }
}
