import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long answer = 0;
    
    for(long i=X;i<100000000;i++){
      int count = 0;
      for(long j=2;j*j<=i;j++){
        if(i%j==0){
          count++;
          break;
        }
      }
      if(count==0){
        answer = i;
        break;
      }
    }
    System.out.println(answer);
  }
}