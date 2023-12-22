import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int A=sc.nextInt();
    int B=sc.nextInt();
    long NUM=(long)N;
    int SUM=0;
    int MAX=(int)Math.pow(10,9)+7;

    
    for(int i=1;i<=N;i++){
      if(i!=A&&i!=B){
        SUM+=NUM%MAX;
        SUM=SUM%MAX;
      }
      NUM=NUM*(N-i)/(i+1);
      //System.out.println(NUM);
    }
    
    System.out.println(SUM);
  }
}