import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int m=Integer.parseInt(sc.next());
int x=Integer.parseInt(sc.next());
int[] a=new int[m];
  int t=0;
  for(int i=0;i<m;i++){
  a[i]=Integer.parseInt(sc.next());
  } 
  for(int i=0;i<m;i++){
  if(a[i]>x){t=i;break;}
  }
System.out.println(Math.min(t,m-t));
}
}