import static java.lang.Math.acos;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        double pi=acos(-1.0);
        Double are=2*pi*r;
        Double toBeTruncated = new Double(are);

Double truncatedDouble = BigDecimal.valueOf(toBeTruncated)
    .setScale(3, RoundingMode.HALF_UP)
    .doubleValue();
        System.out.println(toBeTruncated);
    }
}