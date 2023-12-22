import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        ArrayList<String> ans = new ArrayList<>();
        for (int i=0;i<=S.length()-T.length();i++){
            if (dd(i,S,T)){
                ans.add(constract(i,S,T));
            }
        }
        if (ans.isEmpty()){
            System.out.println("UNRESTORABLE");
        } else {
            Collections.sort(ans);
            System.out.println(ans.get(0));
        }
    }

    static boolean dd(int k,String s,String t){
        int cnt = 0;
        for (int i=0;i<t.length();i++){
            // tのi文字目がsのi+k文字目と違う 且つ sのi+k文字目が?ではない
            // trueの条件 => tのi文字目がsのi+k文字目と同じ もしくは sのi+k文字目が?である
            if (!String.valueOf(t.charAt(i)).equals(String.valueOf(s.charAt(i+k))) && !String.valueOf(s.charAt(i+k)).equals("?")){
                return false;
            } else if (String.valueOf(t.charAt(i)).equals(String.valueOf(s.charAt(i+k)))){
                cnt++;
            }
        }
        if (cnt>0){
            return true;
        } else {
            return false;
        }
    }

    static String constract(int k,String s,String t){
        StringBuffer ans = new StringBuffer(s);
        for (int i=0;i<t.length();i++){
            ans.setCharAt(i+k,t.charAt(i));
        }
        for (int i=0;i<s.length();i++){
            if (String.valueOf(ans.charAt(i)).equals("?")){
                ans.setCharAt(i, 'a');
            }
        }
        return String.valueOf(ans);
    }
}