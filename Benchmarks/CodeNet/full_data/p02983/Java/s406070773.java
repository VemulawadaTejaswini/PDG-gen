import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long L = sc.nextLong(); 
    long R = sc.nextLong(); 

    long min = 2019;
    // for(int i=L; i<=R ||  i<=L+2019;i++){
    if(R-L>=2018){
      System.out.println(0);
      return;
    }
    for(long i=L+1; i<=R;i++){
      long tmp = L%2019;
      min = Math.min((tmp*i)%2019, min);
    }
    System.out.println(min);
  }
}

