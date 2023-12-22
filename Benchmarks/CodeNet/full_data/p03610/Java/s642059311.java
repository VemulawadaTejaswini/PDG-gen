import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String ans="";
String s=sc.next();
    for (int i = 0; i < s.length(); i++) {
        if(i%2==0)ans+=s.charAt(i);
    }
out.println(ans);
}
}