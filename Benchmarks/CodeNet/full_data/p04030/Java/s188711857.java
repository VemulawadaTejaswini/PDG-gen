//https://atcoder.jp/contests/abc043/tasks/abc043_b

import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        ArrayList<String> s = new ArrayList<>();
        for (int i=0;i<S.length();i++){
            if (String.valueOf(S.charAt(i)).equals("B")){
                if (s.size()!=0){
                    s.remove(s.size()-1);
                } else {
                    s.clear();
                }
            } else {
                s.add(String.valueOf(S.charAt(i)));
            }
        }
        String ans = String.join("", s);
        System.out.println(ans);
    }
}