import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().replaceAll("\\?",".");
        String t = sc.next();
        if(s.length() < t.length()){
            System.out.println("UNRESTORABLE");
            return;
        }
        for(int i = s.length() - t.length(); i>=0; i--){
            String x = s.substring(i, i + t.length());
            if(t.matches(x)){
                System.out.println(s.replaceFirst(
                    s.substring(0,i)+x,s.substring(0,i) + t)
                    .replaceAll("\\.", "a"));
                    return;
            }
        }
        System.out.println("UNRESTORABLE");
    }
}