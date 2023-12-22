import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String[] strsOrg = new String[]{"dreamer", "dream", "eraser", "erase"};

        //dreamerser = dream + eraserでdreamerにマッチできない。ユニークな組み合わせにしておく
        String[] strs = new String[16];
        int i = 0;
        for(String s1: strsOrg){
            for(String s2: strsOrg){
                String s = s1 + s2;
                strs[i++] = s;
            }
        }

        int start = 0;
        boolean exist = true;
        while (start < S.length()) {
            boolean existTmp = false;
            for (String s : strs) {
                int end = start + s.length();
                if(end <= S.length() && S.substring(start, end).equals(s)){
                    start = end;
                    existTmp = true;
                    break;
                }
            }

            if(!existTmp){
                exist = existTmp;
                break;
            }
        }

        if (exist) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}