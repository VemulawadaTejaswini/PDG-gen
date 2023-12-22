import java.util.*;
import java.io.*;
public class Main {
    static String s1,s2;
    static boolean b1[],b2[];
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        s1=input.next();
        s2=input.next();
        b1=new boolean[s1.length()];
        b2=new boolean[s2.length()];
        System.out.println(lcs(s1.length()-1,s2.length()-1));
        for(int i=0;i<b1.length;i++) {
            if(b1[i]) {
                System.out.print(s1.charAt(i));
            }
        }
        System.out.println();
    }
    public static int lcs(int indx1, int indx2) {
        if(indx1<0 || indx2<0) {
            return 0;
        }
        if(s1.charAt(indx1)==s2.charAt(indx2)) {
            b1[indx1]=b2[indx2]=true;
            return 1+lcs(indx1-1,indx2-1);
        }
        return Math.max(lcs(indx1-1,indx2),lcs(indx1,indx2-1));
    }
}
