import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weather = sc.next();
        sc.close();

        if (weather.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Rainy");
        } else if (weather.equals("Rainy")) {
            System.out.println("Sunny");
        }
    }
}