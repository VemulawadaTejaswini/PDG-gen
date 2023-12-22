import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        if (A > B) System.out.println(2*A -1);
        else if (B > A) System.out.println(2*B -1);
        else System.out.println(A +B);
//        return;
    }
}