import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 52;//sc.nextInt();
        String s1 = "RvvttdWIyyPPQFFZZssffEEkkaSSDKqcibbeYrhAljCCGGJppHHn";//sc.next();
        String s2 = "RLLwwdWIxxNNQUUXXVVMMooBBaggDKqcimmeYrhAljOOTTJuuzzn";//sc.next();
 
        String VH = "";
        for (int i=0; i<n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                VH += "V";
            } else {
                VH += "H"; i++;
            }
        }
        //System.out.println(VH);
 
        long total = 3;
        if (VH.charAt(0) == 'H') {
            total *= 2;
        }
        int m;
        for (int i=1; i<VH.length(); i++) {
            if (VH.charAt(i) == 'H') {
                if (VH.charAt(i-1) == 'H') {
                    m = 3;
                } else {
                    m = 2;
                }
            } else {
                if (VH.charAt(i-1) == 'H') {
                    m = 1;
                } else {
                    m = 2;
                }
            }
            //System.out.println(total + " x " + m);
            total *= m;
        }
        System.out.println(total%1000000007);
    }
}