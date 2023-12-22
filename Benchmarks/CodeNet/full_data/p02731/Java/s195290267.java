import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        double oneLine = l/(double)3.0;
        DecimalFormat df = new DecimalFormat("0.0000000");
        System.out.println(df.format(oneLine*oneLine*oneLine));
    }
}
