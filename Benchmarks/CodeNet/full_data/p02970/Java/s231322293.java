import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        double n = Double.parseDouble(line1[0]);
        double d = Double.parseDouble(line1[1]);
        System.out.println((int)Math.ceil(n / (d * 2 + 1)));
    }
}
