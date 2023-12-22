import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        int xx = Integer.parseInt(s.substring(0,2));
        int yy = Integer.parseInt(s.substring(2,4));
        String ret = "";
        boolean xIsMonth = 1 <= xx && xx <= 12;
        boolean yIsMonth = 1 <= yy && yy <= 12;
        if(xIsMonth && yIsMonth) {
            ret = "AMBIGUOUS";
        } else if(xIsMonth && !yIsMonth) {
            ret = "MMYY";
        } else if(!xIsMonth && yIsMonth) {
            ret = "YYMM";
        } else {
            ret = "NA";
        }
        System.out.println(ret);
    }
}
