import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    boolean flg=false;
    for(int i=0;i<n;i++){
      if(a[i]%2==0){
        if(a[i]%3==0){
          flg=true;
        }else{
          if(a[i]%5==0){
            flg=true;
          }
        }
      }
    }
    if(flg){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");
    }
  }
}
