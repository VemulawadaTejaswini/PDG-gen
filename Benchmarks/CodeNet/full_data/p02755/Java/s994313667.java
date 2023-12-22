import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double tax8price = ((double)a) / 0.08;
        double tax10 = tax8price * 0.1;

        if(Double.valueOf(tax10).intValue() == (int)b){
            System.out.println(String.valueOf((int)tax8price));
        }else{
            System.out.println("-1");
        }
    }
}
