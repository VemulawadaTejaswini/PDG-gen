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
        for(int i = 0; i < days.length; i++){
            if(day.equals(days[i])){
                flag = true;
            }
            if(flag)
                counter ++;
        }
        return counter;
    }