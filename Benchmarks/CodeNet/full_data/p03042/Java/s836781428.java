import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String YYMM = sc.next();

        int YY =  Character.getNumericValue(YYMM.charAt(0)) *10 + Character.getNumericValue(YYMM.charAt(1));
        int MM =  Character.getNumericValue(YYMM.charAt(2)) *10 + Character.getNumericValue(YYMM.charAt(3));

        if(YY < 13 && YY > 0 && MM < 13 && MM >0){
            System.out.println("AMBIGUOUS");
        } else if ((YY > 12 || YY ==0) &&  MM < 13 && MM >0){
            System.out.println("YYMM");
        } else if ((MM > 12 || MM==0)&& YY <13 && YY > 0){
            System.out.println("MMYY");
        } else {
            System.out.println("NA");
        }



    }
}
