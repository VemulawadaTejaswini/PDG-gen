import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int D=sc.nextInt();
    int N=sc.nextInt();
    int ANS=0;
    
    if(D==0){
      if(N!=100){
        ANS=N;
      }else{
        ANS=N+1;
      }
    }else if(D==1){
      if(N!=100){
        ANS=N*100;
      }else{
        ANS=(N+1)*100;
      }
    }else{
      if(N!=100){
        ANS=N*10000;
      }else{
        ANS=(N+1)*10000;
      }
    }
    
    System.out.println(ANS);
    
  }
}
  