import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int MAX=-1;
    int sum=0;
    
    for(int i=0;i<N;i++){
      int tmp=sc.nextInt();
      sum+=tmp;
      if(MAX<tmp){
        MAX=tmp;
      }
    }
    
    sum-=MAX;
    
    if(sum<=MAX){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
