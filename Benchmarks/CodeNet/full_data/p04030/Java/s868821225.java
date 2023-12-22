import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s=sc.next();
    s=s.replaceAll("0B","");
    s=s.replaceAll("1B","");
    s=s.replaceAll("B","");
System.out.println(s);
            
}
}
