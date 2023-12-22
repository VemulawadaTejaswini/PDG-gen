import java.util.*;
public class MainA{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int d=sc.nextInt();
  int as=sc.nextInt();
  int ar[]=new int[10000];
  int s=0;
  
  for(int i=0;i<as;i++){
  ar[i]=sc.nextInt();
  
  }
  for(int i=0;i<ar.length;i++){
  s=s+ar[i];
  }
  int f=d-s;
  
  
  System.out.println(f);
  
  }
}