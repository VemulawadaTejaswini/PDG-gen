import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weathers[] = new String[3];
        weathers[0] = "Sunny";
        weathers[1] = "Cloudy";
        weathers[2] = "Rainy";
        String today = sc.next();
        int cnt = 0;
        for (String weather : weathers) {
            if (weather.equals(today)) {
                System.out.println(weathers[(cnt + 1) % 3]);
                return;
            }
            cnt++;
        }
    }
}