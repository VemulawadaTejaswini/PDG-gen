import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char[] c=sc.next().toCharArray();
    int ans=754;
    for(int i=0;i<c.length-2;i++){
      char[] a={c[i],c[i+1],c[i+2]};
      int n=Integer.parseInt(String.valueOf(a));
      if(ans>754-n){
        ans=754-n;
      }
    }
    System.out.println(ans);
  }
}