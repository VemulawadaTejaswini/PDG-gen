import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int out = 0;
        for(int i = 0; i < n; i++){
            out = Math.max(out, count(s.substring(0, i), s.substring(i, n)));
        }
        System.out.println(out);
    }

    int count(String s, String t){
        int ret = 0;
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> tset = new HashSet<>();
        for(int i = 0; i < s.length(); i++) set.add(s.charAt(i));
        for(int i = 0; i < t.length(); i++){
            Character c = t.charAt(i);
            if(set.contains(c) && !tset.contains(c)) ret++;
            tset.add(c);
        }
        return ret;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
