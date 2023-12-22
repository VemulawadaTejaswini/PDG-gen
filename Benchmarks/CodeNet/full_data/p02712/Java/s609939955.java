import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long sum = 0;
    for (int i=1;i<n+1;i++){
      if ((i%3!=0)&&(i%5!=0)){
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
