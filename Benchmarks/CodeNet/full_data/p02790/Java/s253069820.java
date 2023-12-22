import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sbA = new StringBuilder();
        for(int i = 0; i < a; i++)
        	sbA.append(b);

        StringBuilder sbB = new StringBuilder();
        for(int i = 0; i < b; i++)
        	sbB.append(a);
        String strA = sbA.toString();
        String strB = sbB.toString();
        System.out.println(strA.compareTo(strB) < 0 ? strA : strB);
    }
}
