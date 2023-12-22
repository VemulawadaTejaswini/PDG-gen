import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int len = s.length();
        Set<Character>[] ary = new Set['z'-'a'+1];
        Set<Character>[] ary2 = new Set['z'-'a'+1];
        for( int i = 0; i < 'z'-'a'+1; i++ ) ary[i] = new TreeSet<>();
        for( int i = 0; i < 'z'-'a'+1; i++ ) ary2[i] = new TreeSet<>();
        String ans = "Yes";
        for( int i = 0; i < len; i++ ) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            ary[b-'a'].add(a);
            ary2[a-'a'].add(b);
            if( ary[b-'a'].size() > 1 || ary2[a-'a'].size() > 1 ) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}