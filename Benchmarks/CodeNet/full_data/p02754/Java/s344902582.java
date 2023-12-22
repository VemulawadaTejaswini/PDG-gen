import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextInt();
    long count = 0;
    long i= 0;
   while(i < n){
    for(int j = 0; j < a; j++){
      count++;
      i++;
      if( i >= n) {
    	  break;
      }
    }
    for(int k = 0; k < b;k++){
      i++;
    }
  }
    System.out.println(count);
  }
}