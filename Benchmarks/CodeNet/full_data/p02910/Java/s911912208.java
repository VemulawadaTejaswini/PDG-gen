import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  char[]c=sc.next().toCharArray();
  boolean b=true;
  char[]po=new char[]{'L','R'};
  for(int i=0;i<c.length;i++){
  if(c[i]==po[i%2])b=false;
  }
  System.out.println(b?"Yes":"No");

}

}
