import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner data = new Scanner(System.in);
            int n = Integer.parseInt(data.next());
            double money = 0;
            double sum = 0;
            for (int i=0; i<n; i++) {
                money = data.nextDouble();
                String type = data.next();
                if (type.equals("JPY")){
                    sum = sum + money;
                } else {
                    sum = sum + (money * 380000.0);
                }
            }
            System.out.println(sum);
            data.close();
        } catch (NumberFormatException nfe) {
          System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }

    Main() {

    }
}