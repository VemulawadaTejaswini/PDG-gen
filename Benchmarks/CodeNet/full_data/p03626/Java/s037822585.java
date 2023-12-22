import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        String VH = "";
        for (int i=0; i<n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                VH += "V";
            } else {
                VH += "H"; i++;
            }
        }
        System.out.println(VH);

        long total = 3;
        if (VH.charAt(0) == 'H') {
            total *= 2;
        }
        for (int i=1; i<VH.length(); i++) {
            if (VH.charAt(i) == 'H') {
                if (VH.charAt(i-1) == 'H') {
                    total *= 3;
                } else {
                    total *= 2;
                }
            } else {
                if (VH.charAt(i-1) == 'H') {
                    //total *= 1;
                } else {
                    total *= 2;
                }
            }
            //System.out.println(total);
        }
        System.out.println(total);
    }
}
