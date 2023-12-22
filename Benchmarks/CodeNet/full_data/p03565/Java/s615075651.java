import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String[] s = S.split("");
        String[] t = T.split("");
        
        boolean hantei = false;
        StringBuilder ans = new StringBuilder();
        List<String> l = new ArrayList<>();
        for(int i=0; i<s.length-t.length+1; i++) {
            int x = 0;
            for(int j=i; j<i+t.length; j++) {
                if(s[j].equals(t[x]) || s[j].equals("?")) x++;
                else break;
            }
            if(x == t.length) {
                hantei = true;
                x = 0;
                for(int k=0; k<s.length; k++) {
                    if(k >= i && k < i+t.length) {
                        ans.append(t[x]); 
                        x++;
                    }else if(s[k].equals("?")) {
                        ans.append("a");
                    }else {
                        ans.append(s[k]);
                    }
                }
                l.add(String.valueOf(ans));
                ans = new StringBuilder();
            }
        }
        
        if(hantei) {
            Collections.sort(l);
            System.out.println(l.get(0));
        }else {
            System.out.println("UNRESTORABLE");
        }

    }
}