import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x;
    x=scan.nextInt();


    for(int j=0;j<100;j++){
      if(isPrime(x+j)){
        System.out.println(x+j);
        return;
      }
    }
    //System.out.println(5+" sqrt "+Math.sqrt(5)+ " isp "+isPrime(5));
  }

  public static Boolean isPrime(int a){
    if(a<2){
      return false;
    }
    for(int i=2;i<=Math.sqrt(a);i++){
      if(a%i==0){
        return false;
      }
    }
    return true;
  }
}