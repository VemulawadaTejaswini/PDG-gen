import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int year = Integer.parseInt(S.substring(0,4));
        int month = Integer.parseInt(S.substring(5,7));
        int day = Integer.parseInt(S.substring(8,10));

        if(year < 2019){
            System.out.println("Heisei");
            return;
        }
        if(month <= 4 && year==2019){
            System.out.println("Heisei");
            return;
        }
//        if(month == 4 && day<=30 && year==2019) System.out.println("Heisei");
        System.out.println("TBD");
    }
}
