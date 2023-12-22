import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        Set<String> ch = new HashSet<>();
        String s1 = str.substring(str.length()/2);
        String s2 = str.substring(0,str.length()/2);
        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();
        sb = new StringBuilder(str);
        sb.reverse();
        String rev1 = sb.toString();
        String rev = sb.toString();
        int change = 0;
        String[] str1 = s1.split("");
        String[] str2 = rev.split("");
        String[] st1 = str.split("");
        String[] r1 = rev1.split("");

        int j = 0;
        if (str.length()%2 != 0) {
            for (String i : st1) {
                if (!(i.equals(r1[j]))) {
                    ch.add(i);
                }
                j++;
            }
        } else {
            if (s1 == rev) {
                System.out.println(change);
            } else {
                for (String i : str1) {
                    if (!(i.equals(str2[j]))) {
                        change += 1;
                    }
                    j++;
                }
            }
        }
        change = ch.size();
        System.out.println(change);

    }
}
