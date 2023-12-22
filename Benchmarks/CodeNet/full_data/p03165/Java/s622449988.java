import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  String s=sc.next();
  String t=sc.next();
  String arr[][]=new String[s.length+1][t.length+1];
  for(int i=1;i<=t.length;i++){
  for(int j=1;j<=s.length;j++){
  if(arr[i-1][j].length()<j&&s.charAt(i)==t.charAt(j)){
  arr[i][j]=arr[i-1][j]+Character.toString(s.charAt(i));
  }
  }
  }
  System.out.println(arr[s.length][t.length]);
}
}