import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        boolean isa = true;
        int a = 0;
        int z = 0;
        for(int i=0; i<s.length; i++) {
            if(isa) {
                if(s[i].equals("A")) {
                    a = i;
                    isa = false;
                }
            }
            if(s[i].equals("Z")) z = i;
        }
        System.out.println(z-a+1);
     }
}