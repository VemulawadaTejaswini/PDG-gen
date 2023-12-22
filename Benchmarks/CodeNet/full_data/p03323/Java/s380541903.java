import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    String str1 = scan.next();
    String str2 = scan.next();

 		int a = Integer.parseInt(str1);
      	int b = Integer.parseInt(str2);
      
      int result1 = a/b;
      int result2 = b/a;
      if((result1 > 1 || result2 > 2) && (a+b)>=16){
      	System.out.println(":(");
      }else{
        System.out.println("Yay!");
	  }
    }
}