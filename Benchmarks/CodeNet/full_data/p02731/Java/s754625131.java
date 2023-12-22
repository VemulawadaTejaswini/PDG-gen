import java.text.DecimalFormat;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s=in.nextDouble();

        DecimalFormat df = new DecimalFormat( "0.000000 ");

        System.out.println(df.format(s*s*s/27));

    }
}
