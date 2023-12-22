import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for (int i=0; i<Q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
         for (int i=0; i<Q; i++) {
            String s = S.substring(l[i]-1,r[i]);
            String temp = s.replace("AC", "");
            int occ = (s.length() - temp.length()) / 2;
            System.out.println(occ);
        }
    }
}