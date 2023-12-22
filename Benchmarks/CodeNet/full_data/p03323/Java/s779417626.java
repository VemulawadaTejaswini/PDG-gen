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
    
	  if(a<0 || a>16)
        System.out.println(":(");
 	  if(b<0 || b>16)
        System.out.println(":(");
      if(a+b > 16)
        System.out.println(":(");

      if((result1 > 2 || result2 > 2) 
         && (a > 8 || b > 8 )){
      	System.out.println(":(");
      }else{
        System.out.println("Yay!");
	  }
    }
}