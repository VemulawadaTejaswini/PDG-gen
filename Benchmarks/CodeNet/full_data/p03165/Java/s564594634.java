

import java.util.Scanner;

public class Main {
    public static String[][] smemo;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        smemo = new String[s.length()+1][t.length()+1];
//        for(int i = 0; i <= s.length(); i++){
//            for(int j = 0; j <= t.length(); j++){
//                smemo[i][j] = "";
//            }
//        }
        System.out.println(lcs(s,t,s.length(),t.length()));
    }

    public static String lcs(String s, String t, int i, int j){
        if(i<=0||j<=0) return "";
        if(!smemo[i][j].equals("")) return smemo[i][j];
        String res = "";
        if(s.charAt(i-1)==t.charAt(j-1)){
            res = lcs(s,t,i-1,j-1) + s.charAt(i-1);
        }else{
            String a = lcs(s,t,i,j-1);
            String b = lcs(s,t,i-1,j);
            res = b;
            if(a.length()>b.length()){
                res = a;
            }
        }
        smemo[i][j] = res;
        return res;
    }
}
