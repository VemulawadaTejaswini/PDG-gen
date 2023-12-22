import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        if(day.equals("SUN")){
            System.out.println("7");
        }
        if(day.equals("SAT")){
            System.out.println("1");
        }
        if(day.equals("MON")){
            System.out.println("6");
        }
        if(day.equals("TUE")){
            System.out.println("5");
        }
        if(day.equals("WED")){
            System.out.println("4");
        }
        if(day.equals("THU")){
            System.out.println("3");
        }        
        if(day.equals("FRI")){
            System.out.println("2");
        }

    }
}