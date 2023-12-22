import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int a =sc.nextInt();
    int b =sc.nextInt();
    int x=1;
    for(int i=0;i<n;i++){
      x=x*2;}
    int y=1;
    int z=1;
    for(int j=0;j<a;j++){
      y=y*(n-j);
      z=z*(a-j);}
    int w=y/z;
    int p=1;
    int q=1;
    for(int k=0;k<b;k++){
      p=p*(n-k);q=q*(b-k);}
    int r=p/q;
    System.out.println(x-w-r-1);
  }
}