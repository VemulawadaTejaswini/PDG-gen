import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  String t = sc.next();
  char[] a = s.toCharArray();
  char[] b = t.toCharArray();
  int p = -1;
  boolean ex = false;
  for(int i = a.length - b.length;i >= 0;i--){
    boolean ok = true;
    for(int j = i;j < i + b.length;j++){
      if(a[j] != b[j-i] && a[j] != '?'){
        ok = false;
        break;
      }
    }
    if(ok){
      p = i;
      ex = true;
      break;
    }
  }
  if(ex){
    for(int i = 0;i < p;i++){
      System.out.print(a[i] == '?' ? 'a':a[i]);
    }
    if(p + b.length == a.length){
    System.out.println(t);
    }
    else{
      System.out.print(t);
      for(int i = p + b.length;i < a.length;i++){
        System.out.print(a[i] == '?' ? 'a':a[i]);
      }
      System.out.println("");
    }
  }
  else{
    System.out.println("UNRESTORABLE");
  }
}}