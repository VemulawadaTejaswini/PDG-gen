import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        int ans=0;
        if(a.equals("MON"))ans=6;
        if(a.equals("TUE"))ans=5;
        if(a.equals("WED"))ans=4;
        if(a.equals("THU"))ans=3;
        if(a.equals("FRI"))ans=2;
        if(a.equals("SAT"))ans=1;
        if(a.equals("SUN"))ans=7;
        System.out.println(ans);
    }
}
