import java.util.*;
public class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int len=s.nextInt();
  String string=s.next();
  char[] arr=string.toCharArray();
  for(char a:arr){
  a=a+len;
  }
  System.out.println(arr.toString());
}}