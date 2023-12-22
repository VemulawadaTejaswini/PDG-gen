import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean isMatch = true;
        if (s.length() >= t.length()) {
            for (int i = 0; i <= s.length() - t.length(); i++) {
                String parts = s.substring(i, t.length() + i);
                //System.out.println(parts);
                isMatch = true;
                if (t.equals(parts)) {
                    System.out.println(s.replaceAll("\\?", "a"));
                    break;
                } else {
                    for (int j = 0; j < parts.length(); j++) {
                        if (t.charAt(j) != parts.charAt(j) && parts.charAt(j) != '?') {
                            // not match
                            isMatch = false;
                            break;
                        }
                    }
                }
                if(isMatch) {
                    String result = s.replaceFirst(parts.replaceAll("\\?", "\\\\?"), t).replaceAll("\\?", "a");
                    System.out.println(result);
                    break;
                }
            }
        } else {
            System.out.println("UNRESTORABLE");
        }

        if(!isMatch) {
            System.out.println("UNRESTORABLE");
        }
    }
}