import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String [] S1 = S.split("/",0);
        int year,month,day;
         year = Integer.parseInt(S1[0]);
         month = Integer.parseInt(S1[1]);
         day = Integer.parseInt(S1[2]);
        if(month>=5) System.out.println("TBD");
        else System.out.println("Heisei");

    }
}