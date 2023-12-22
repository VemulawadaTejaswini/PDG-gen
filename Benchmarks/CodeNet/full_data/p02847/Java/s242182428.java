import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Can't Wait for Holiday
    //又是最无聊的第一题, 呵呵
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> days = Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
        int index = days.indexOf(s);
        System.out.println(7 - index);
        sc.close();
    }
}
