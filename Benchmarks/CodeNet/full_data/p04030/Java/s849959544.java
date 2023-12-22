import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s=sc.next();
    String t;
    t=s.replaceAll("0B","");
    t=s.replaceAll("1B", "");
    t=s.replaceAll("B","");
System.out.println(t);
            
}
}
