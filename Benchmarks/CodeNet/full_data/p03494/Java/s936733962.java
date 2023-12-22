import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int num[]=new int[n];
  boolean b=true;
  int count=0;
  for(int i=0;i<n;i++){
  num[i]=sc.nextInt();
    if(((num[i]/=2)%2)==1)b=false;
  }
  
  while(b){
    if(count==0)
    count++;
  for(int i=0;i<n;i++){
    if(((num[i]/=2)%2)==1)b=false;
  }
    count++;
  }
  System.out.println(count);
}
}