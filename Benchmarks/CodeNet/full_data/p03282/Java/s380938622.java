import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String s = sc.next();
long k = sc.nextLong();
int temp=0;
char p='1';
for (int i = 0; i < s.length(); i++) {
    if(s.charAt(i)!='1'){
        p=s.charAt(i);break;
    }
    temp++;
}
if(temp>=k){
    out.println(1);
}else{
    out.println(p);
}
}}