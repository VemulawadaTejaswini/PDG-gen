import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String S = sc.next();

for(int i=0;i<S.length();i += 2){
System.out.print(S.charAt(i));
}

} 
}