import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  char[] c = s.toCharArray();
  String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
  String[] d = new String[c.length];
  Set<String> hs = new HashSet<String>();
  for(int i = 0;i < s.length();i++){
	  d[i] = String.valueOf(c[i]);
	  hs.add(d[i]);
  }
  if(hs.size() == 26)System.out.println("None");
  else {
    for(int i = 0;;i++){
      if(!(hs.contains(alp[i]))){
        System.out.println(alp[i]);
        break;
      }
    }
  }
}}
  