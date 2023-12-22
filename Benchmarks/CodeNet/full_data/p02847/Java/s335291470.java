import java.util.Scanner;

/**
 * WaitForSunday
 */
class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int DayToNextSunday = 0 ;
        switch (s) {
            case "MON": 
                    DayToNextSunday = 6;
                break;
            case "TUE":
                    DayToNextSunday = 5;
                break;
            case "WED":
                    DayToNextSunday = 4;
                break;
            case "THU":
                    DayToNextSunday = 3;
                break;
            case "FRI":
                    DayToNextSunday = 2;
                break;
            case "SAT":
                    DayToNextSunday = 1;
                break;
            case "SUN":
                DayToNextSunday = 7;
            break;
            default:
                break;
        }
        System.out.println(DayToNextSunday);
    }
}