import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean flg=true;
    if(n%2!=0){
      flg=false;
    }else{
      char[] c=sc.next().toCharArray();
      char[] a=new char[n/2];
      char[] b=new char[n/2];
      for(int i=0;i<n/2;i++){
        if(a[i]!=b[i]){
          flg=false;
          break;
        }
      }
    }
    if(flg){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}