import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    for( int i = 0; i <= 2 ; i++){
      String y = x.substring(i, i+1);
	  if( y.equals(x.substring(i + 1, i + 2))){
        System.out.println("BAD");
      }
    }
    System.out.println("Good");
  }
} 
