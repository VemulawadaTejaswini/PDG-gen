import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long count = 0;
    long i= 0;
   while(i < n){
    for(long j = 0; j < a; j++){
      count++;
      i++;
      if( i >= n) {
    	  break;
      }
    }
    for(long k = 0; k < b;k++){
      i++;
    }
  }
    System.out.println(count);
  }
}