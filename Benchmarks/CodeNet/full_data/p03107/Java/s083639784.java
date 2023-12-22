import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int count0 = 0;
        int count1 = 0;
        for(int i=0; i<s.length; i++) {
            if(s[i].equals("0")) count0++;
            else count1++;
        }
        if(count0 >= count1) System.out.println(count1*2);
        else System.out.println(count0*2);
    }
}
