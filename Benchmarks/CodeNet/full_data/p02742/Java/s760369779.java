import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
         int H = sc.nextInt();
        int W = sc.nextInt();
        sc.close();

        int n1 = (H - 1) / 2 + 1;
        int n2 = H / 2;
        n1 *= (W / 2 + W % 2);
        n2 *= W / 2;
        int sum = n1 + n2;

        System.out.println(sum);
    }
}