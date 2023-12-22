import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int N = s.length();
        sc.close();

        int idx = 0;
        int min = 100;
        while(idx < 26){
            char c = (char)('a' + idx);
            if(include(s, c)){
                int cnt = 0;
                String now = s;
                while(!(check(now, c))){
                    String str = "";
                    for(int i = 0; i < now.length()-1; i++){
                        if(now.charAt(i) == c || now.charAt(i+1) == c){
                            str += c;
                        } else {
                            str += now.charAt(i);
                        }
                    }
                    cnt++;
                    now = str;
                    //System.out.println(now);
                }
                min = Math.min(min, cnt);
            } 
            idx++;
        }
        System.out.println(min);
    }

    static boolean include(String s, char c){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c)
                return true;
        }
        return false;
    }

    static boolean check(String s, char c){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != c)
                return false;
        }
        return true;
    }
}