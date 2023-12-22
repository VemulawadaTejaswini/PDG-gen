import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String chars, chart;
        int l = s.length();
        boolean ans = true;
        
        for(int i=0; i<l; i++){  
            chars = String.valueOf(s.charAt(i));
            chart = String.valueOf(t.charAt(i));
            System.out.println("("+chars+", "+chart+")");
            if(s.replaceAll(chars, "").length() !=
            t.replaceAll(chart, "").length()){
                ans = false;
                System.out.println("s: "+s.replaceAll(chars, "").length());
                System.out.println("t: "+t.replaceAll(chart, "").length());
                break;
            }
        }

        System.out.println(ans?"Yes":"No");
    }
}