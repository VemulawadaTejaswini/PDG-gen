import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        Map<String, Integer> nextHolidayMap = new HashMap<>();

        nextHolidayMap.put("SUN", 7);
        nextHolidayMap.put("MON", 6);
        nextHolidayMap.put("TUE", 5);
        nextHolidayMap.put("WED", 4);
        nextHolidayMap.put("THU", 3);
        nextHolidayMap.put("FRI", 2);
        nextHolidayMap.put("SAT", 1);

        System.out.println(nextHolidayMap.get(S));
    }

}