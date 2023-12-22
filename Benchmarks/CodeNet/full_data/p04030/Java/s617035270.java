import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int l = s.length();
        String ans = "";
        String st = "01B";
        
        for(int i=0; i<l-1; i++){
            if(s.charAt(i)!=st.charAt(2) && s.charAt(i+1)!=st.charAt(2)){
                ans += String.valueOf((char)s.charAt(i));
            }
        }
        if(s.charAt(l-1)==st.charAt(2)){
            System.out.println(ans);
        }
        else{
            System.out.println(ans + s.substring(l-1));
        }

    }
}