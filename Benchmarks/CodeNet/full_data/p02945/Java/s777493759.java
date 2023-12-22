import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        int wa = A + B;
        int sa = A - B;
        int seki = A * B;

        if (wa >= sa && wa >= seki)
            System.out.println(wa);
        if (sa >= wa && sa >= seki)
            System.out.println(sa);
        if(seki >= wa && seki >= sa)
            System.out.println(seki);
        sc.close();
    }
}