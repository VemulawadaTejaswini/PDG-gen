import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long M = sc.nextInt();
    if(N>=2*M){//Sが多い時は、cの数/2でいい
      System.out.println(M/2);
      return;
    }
    //cのほうが2倍の分多いときは、(2*N+M)/4でいい
    System.out.println((2*N+M)/4);
      
  }
  

  
}
