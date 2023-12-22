import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  long a=Long.parseLong(sc.next());
  long b=Long.parseLong(sc.next());
  long n=Long.parseLong(sc.next());
  while(a%n!=0)a++;
  while(b%n!=0)b--;
  if(a>b)System.out.println(0);
  else if(a==b)System.out.println(1);
  else System.out.println((b-a)/n+1);
}
}
