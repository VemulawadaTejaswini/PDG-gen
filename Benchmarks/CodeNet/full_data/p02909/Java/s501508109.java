import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String weather[] = new String[3];
        String s = scanner.next();

        weather[0] = "Sunny";
        weather[1] = "Cloudy";
        weather[2] = "Rainy";

        for (int i=0; i <= weather.length; i++) {
            if (weather[i].equals(s) != (i == 2)) {
                System.out.println(weather[i+1]);
                break;
            } else {
                System.out.println(weather[0]);
                break;
            }
        }
    }
}
