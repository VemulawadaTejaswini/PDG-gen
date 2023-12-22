import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        String d = day.nextLine();
        if (d.equals("SUN")){
            System.out.println(7);
        }
        if (d.equals("MON")){
            System.out.println(6);
        }
        if (d.equals("TUE")){
            System.out.println(5);
        }
        if (d.equals("WED")){
            System.out.println(4);
        }
        if (d.equals("THU")){
            System.out.println(3);
        }
        if (d.equals("FRI")){
            System.out.println(2);
        }
        if (d.equals("SAT")){
            System.out.println(1);
        }


    }
}
