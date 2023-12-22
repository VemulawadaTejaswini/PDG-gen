import java.util.*;


public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String day = sc.nextLine();
      int output = 0;
        switch(day){
          case "SUN":
            output = 7;
            break;
          case "MON":
            output = 6;
            break;
          case "TUE":
            output = 5;
            break;
          case "WED":
            output = 4;
            break;
          case "THU":
            output = 3;
            break;
          case "FRI":
            output = 2;
            break;
          case "SAT":
            output = 1;
            break;
          default:
            break;
    	}
    System.out.println(output);
    }
}