import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cnt = 0;
        String str;

        String s1 = sc.next();
       

        while(true){

        if(s1 != null && s1.length() > 0){
           s1 = s1.substring(0, s1.length()-1);
        }
        
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();


        if(s1.equals( s2 )) break;

}
        //int i = Integer.parseInt(s1);
        System.out.println(s1.length());
    }

}