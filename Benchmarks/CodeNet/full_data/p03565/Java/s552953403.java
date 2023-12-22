import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        flag:for(int i=s.length()-t.length();i>=0;i--){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i+j)!=t.charAt(j)&&s.charAt(i+j)!='?'){
                    continue flag;
                }
            }
            System.out.println(s.substring(0,i).replaceAll(Pattern.quote("?"), "a")+t+s.substring(i+t.length()).replaceAll(Pattern.quote("?"),"a"));
            return;
        }
        System.out.println("UNRESTORABLE");
    }
}