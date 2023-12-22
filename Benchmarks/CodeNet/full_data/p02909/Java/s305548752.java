import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String result = "Rainy";
        if (s.equals("Sunny")) {
            result = "Cloudy";
        } else if (s.equals("Rainy")) {
            result = "Sunny";
        }
        System.out.println(result);
    }
}
