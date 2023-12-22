import java.util.Scanner;

public class Main{
  static int max;
  static int N;
  static int count;
  static String str;
  static char st;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    str = sc.next();
    N = str.length();
    max = 0;
    for(int i=0;i<N;i++){
      st = str.charAt(i);
      if(st=='A' || st=='G' || st=='C' || st=='T'){
		count++;
      }
      else if(count>=max){
		max = count;
        count = 0;
      }
    }
    System.out.println(max);
  }
  
}
          
    
