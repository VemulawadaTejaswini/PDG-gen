import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str = in.next();
        int first = Integer.parseInt("" + str.charAt(0) + str.charAt(1));
        int second = Integer.parseInt(""+ str.charAt(2) + str.charAt(3));
        if (first > 12 && second <= 12 && second >= 1) System.out.println("YYMM");
        else if ( first <= 12 && first >= 1 && second > 12) System.out.println("MMYY");
        else if ( first <= 12 && first >= 1 && second <= 12 && second >= 1 ) System.out.println("AMBIGUOUS");
        else System.out.println("NA");
    }
}