import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        double volume = num/3;
        DecimalFormat numberFormat = new DecimalFormat("#.000000000000");
        System.out.println(numberFormat.format(volume*volume*volume));
        
    }
}