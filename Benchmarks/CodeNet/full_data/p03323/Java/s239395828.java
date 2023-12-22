import java.util.*;

class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d,n;
    d = sc.nextInt();
    n = sc.nextInt();
    if(d==0){
      System.out.println(n);
    }
    else if(d==1){
      System.out.println(100*n);
    }
    else if(n==100){
      if(d==0){
        System.out.println(n+1);
      }
      else if(d==1){
        System.out.println(100*n+100);
      }
      else{
        System.out.println(10000*n+10000);
      }
    }
    else {
      System.out.println(10000*n);
    }
  }
  
}
