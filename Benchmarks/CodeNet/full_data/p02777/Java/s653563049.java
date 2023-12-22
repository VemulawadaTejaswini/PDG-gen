import java.io.*; 
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
public static void main(String[] args){
try{
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
     String c = reader.readLine();
     String d = reader.readLine();
    String parts[] = b.split(" ");
    String S = parts[0];
  String T = parts[1];
  String parts2[] = c.split(" ");
  int n1 = Integer.parseInt(parts2[0]);
  int n2 = Integer.parseInt(parts2[1]);
  if(d.compareTo(S)==0){
    System.out.println((n1 - 1) +" "+n2);}else if(d.compareTo(T)==0){
     System.out.println(n1  +" "+(n2-1));
  }else{
     System.out.println(n1  +" "+(n2));
  }
}catch(Exception e){}
}
}