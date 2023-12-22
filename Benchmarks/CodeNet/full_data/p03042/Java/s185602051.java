import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String pre = s.substring(0, 3);
        String end = s.substring(2, 4);
        Integer preI = Integer.valueOf(pre);
        Integer endI = Integer.valueOf(end);
        boolean isPrePossibleM = 1 <= preI && preI <=12;
        boolean isEndPossibleM = 1 <= endI && endI <=12;
      	if (!isPrePossibleM && !isEndPossibleM) {
            System.out.println("NA");
        } else if (isPrePossibleM && isEndPossibleM) {
            System.out.println("AMBIGUOUS");
        } else if (isPrePossibleM && !isEndPossibleM) {
            System.out.println("MMYY");
        } else if (!isPrePossibleM && isEndPossibleM) {
            System.out.println("YYMM");
        } 
    }
}