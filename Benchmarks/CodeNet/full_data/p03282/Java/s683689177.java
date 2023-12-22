import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        long o = 0;
        int a[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            a[i] = Character.getNumericValue(s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            if (a[i] == 1) {
                o++;
            }else{
                break;
            }
        }
        if (o >= k) {
            System.out.println(1);
        }else{
            System.out.println(s.charAt((int)o));
        }
    }
}