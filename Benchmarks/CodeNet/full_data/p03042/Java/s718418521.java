import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int before = Integer.parseInt(s.substring(0,2));
        int after = Integer.parseInt(s.substring(2));

        boolean yymm, mmyy;
        yymm = mmyy = false;
        if(0 <= before && before < 100 && 0 < after && after < 13) yymm = true;
        if(0 <= after && after < 100 && 0 < before && before < 13) mmyy = true;

        if(yymm && mmyy) System.out.println("AMBIGUOUS");
        else if(yymm) System.out.println("YYMM");
        else if(mmyy) System.out.println("MMYY");
        else System.out.println("NA");

        return;
    }
}
