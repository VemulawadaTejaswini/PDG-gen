import java.util.*;
public class Main {
  public static void main (String[] args ){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int count = sc.nextInt();
    for(int i=0 ,i<count,i++){sum = sum +sc.nextInt();};
    if (sum<H){
      System.out.println( "No" );}
    else { 
      System.out.println( "Yes" );};
  }
}
    