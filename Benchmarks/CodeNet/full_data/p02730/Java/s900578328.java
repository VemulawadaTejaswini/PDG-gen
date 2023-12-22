import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next();
    char[] a;
    a=s.toCharArray();
    int n=s.length();
    int f=0;
    for(int i=0;i<((n-1)/2);i++){
      if(a[i]==(a[n-1-i])){
        if(a[i]==(a[((n-1)/2)-i])){
          if(a[((n+1)/2)+i]==(a[n-1-i])){
            f++;
          }else{f=0;
               break;}
        }else{f=0;
             break;}
      }else{f=0;
           break;}
    }
    if(f<=0){
      System.out.print("No");
    }else{
      System.out.print("Yes");
    }
    
  }
}