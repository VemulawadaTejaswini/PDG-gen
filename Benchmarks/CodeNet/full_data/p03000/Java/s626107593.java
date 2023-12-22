import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    int n,x,l,sum=0,cnt=1;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    x=sc.nextInt();
    while(sum + (l=sc.nextInt()) <= x && cnt < n+1){
      sum+=l;
      cnt++;
    }
    System.out.println(cnt);
  }
}