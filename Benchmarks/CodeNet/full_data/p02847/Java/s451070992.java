import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        System.out.println(Days(t));
    }

    private static int Days(String day){
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int counter = 0;
        boolean flag = false;
        for (String s : days) {
            if (day.equals(s)) {
                flag = true;
            }
            if (flag)
                counter++;
        }
        return counter;
    }
