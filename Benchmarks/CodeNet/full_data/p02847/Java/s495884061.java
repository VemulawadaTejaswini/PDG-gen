import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> week = Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
        System.out.println(7 - week.indexOf(sc.next()));
    }
}