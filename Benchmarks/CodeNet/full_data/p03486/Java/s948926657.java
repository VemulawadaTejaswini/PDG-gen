import java.util.*;
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String[] s1a = new String[s1.length()];
        String s2 = sc.next();
        String[] s2a = new String[s2.length()];
        
        for(int nLp = 0; nLp < s1.length();nLp++) {
            s1a[nLp] = s1.substring(nLp, nLp+1);
        }
        for(int nLp = 0; nLp < s2.length();nLp++) {
            s2a[nLp] = s2.substring(nLp, nLp+1);
        }
//        for(String s : s1a)
//        System.out.println(s);
//        for(String s : s2a)
//        System.out.println(s);
        
        Arrays.sort(s1a,new Comparator() {
            @Override
            public int compare(Object arg0, Object arg1) {
                return arg1.hashCode() - arg0.hashCode();
            }
            
        });        
        Arrays.sort(s2a,new Comparator() {
            @Override
            public int compare(Object arg0, Object arg1) {
                return arg1.hashCode() - arg0.hashCode();
            }
            
        });
//
//        for(String s : s1a)
//        System.out.println(s);
//        for(String s : s2a)
//        System.out.println(s);
        
        StringBuffer sb1 = new StringBuffer();
        for(int nLp = 0; nLp < s1.length();nLp++) {
           sb1.append(s1a[nLp]);
        }
        StringBuffer sb2 = new StringBuffer();
        for(int nLp = 0; nLp < s2.length();nLp++) {
           sb2.append(s2a[nLp]);
        }

//        System.out.println(sb1.toString());
//        System.out.println(sb2.toString());
        // 出力v
        if (sb1.toString().compareTo(sb2.toString()) <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
}
}