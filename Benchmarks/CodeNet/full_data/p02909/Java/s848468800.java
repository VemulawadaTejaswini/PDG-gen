import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String weather = scan.next();
        if (weather.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}
