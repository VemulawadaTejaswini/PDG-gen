import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        if (A==C | B==D) { System.out.println(0); return; }

        long ans = (D-B)/(C-A);
        if ((D-B) % (C-A) != 0) { ans++; }
        ans *= (C-A);
        System.out.println(ans);
    }
}
