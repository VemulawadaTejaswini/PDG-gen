import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int acoin = sc.nextInt();
    int bcoin = sc.nextInt();
    int ccoin = sc.nextInt();
    int total = sc.nextInt();
    int count = 0;
    for(int i=0;i<=acoin;i++){
      for(int j=0;j<=bcoin;j++){
        for(int k=0;k<=ccoin;k++){
          if(i*500+j*100+k*50 == total){
            count++;
            break;
          }
        }
      }
    }
    System.out.println(count);
  }
}