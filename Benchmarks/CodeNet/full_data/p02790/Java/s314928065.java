import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        
        String A = "";
        String B = "";
        for(int i = 0; i < intb; i++) {
            A = A + a;
        }

        for(int i = 0; i < inta; i++) {
            B = B + b;
        }
        
        if(A.compareTo(B) == -1) {
            System.out.println(A);
        }else {
            System.out.println(B);
        }
        
        }
}
