import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  while(s.contains("B")){
    int idx = s.indexOf("B");
    s = (idx > 0 ? s.substring(0,idx-1) : "") + s.substring(idx+1);
  }
  System.out.println(s);
}}
