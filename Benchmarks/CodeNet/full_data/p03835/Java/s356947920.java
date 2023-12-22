import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int s=sc.nextInt();
    int x,y,z,cnt=0;
    sc.close();
    for(int i=Math.max(0,s-2*k);i<=Math.min(k,s);i++){
      x=i;
      for(int j=Math.max(0,s-i-k);j<=Math.min(k,s-i);j++){
        y=j;
        for(int l=Math.max(0,s-i-j);l<=Math.min(k,s-i-j);l++){
          z=l;
          if(x+y+z==s){
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}