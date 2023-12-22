import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String[] s1a = new String[s1.length()];
        String s2 = sc.next();
        String[] s2a = new String[s2.length()];
 
        for(int nLp = 0; nLp < s1.length();nLp++) {
            s1a[nLp] = s1.substring(nLp, nLp);
        }
        for(int nLp = 0; nLp < s2.length();nLp++) {
            s2a[nLp] = s2.substring(nLp, nLp);
        }
        Arrays.sort(s1a);
        Arrays.sort(s2a);

        StringBuffer sb1 = new StringBuffer();
        for(int nLp = 0; nLp < s1.length();nLp++) {
           sb1.append(s1a[nLp]);
        }
        StringBuffer sb2 = new StringBuffer();
        for(int nLp = 0; nLp < s2.length();nLp++) {
           sb2.append(s2a[nLp]);
        }

        // 出力
        if (sb1.toString().compareTo(sb2.toString()) >= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
}
}