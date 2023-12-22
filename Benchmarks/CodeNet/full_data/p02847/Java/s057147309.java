import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        String n = yomi.next();
        if (n.equals("SUN")){
            System.out.println(7);
        }else if (n.equalsIgnoreCase("MON")){
            System.out.println(6);
        }else if (n.equalsIgnoreCase("TUE")){
            System.out.println(5);
        }else if (n.equalsIgnoreCase("WED")){
            System.out.println(4);
        }else if (n.equalsIgnoreCase("THU")){
            System.out.println(3);
        }else if (n.equalsIgnoreCase("FRI")){
            System.out.println(2);
        }else if (n.equalsIgnoreCase("SAT")){
            System.out.println(1);
        }

    }
}