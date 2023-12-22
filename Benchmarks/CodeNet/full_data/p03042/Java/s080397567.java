import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ss = Integer.parseInt(s);
        int p = ss / 100;
        int b = ss % 100;
        if(p == 0&&b==0){
            System.out.println("NA");
        }
        else if(p > 0 && p < 13 && b > 0 && b < 13){
            System.out.println("AMBIGUOUS");
        }else if(b > 0 && b < 13){
            System.out.println("YYMM");
        }else if(p > 0 && p < 13){
            System.out.println("MMYY");
        }else{
            System.out.println("NA");
        }
    }
}