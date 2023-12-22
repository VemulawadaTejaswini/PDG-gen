import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int y=sc.nextInt();
    for(int man=0;man<=n;man++){
      for(int gos=0;gos+man<=n;gos++){
        int sen=n-man-gos;
        if(10000*man+5000*gos+1000*sen==y){
          System.out.println(man+" "+gos+" "+sen);
          return;
        }
      }
    }
    System.out.println("-1 -1 -1");
  }
}