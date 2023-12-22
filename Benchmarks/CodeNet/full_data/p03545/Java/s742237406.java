import java.util.*;

public class Main{
	public  static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	int a = N / 1000;
      	int b = N / 100 - 10 * a;
      	int c = N / 10 - 100 * a - 10 * b;
      	int d = N % 10;
      	if(a + b + c + d == 7){
         	System.out.print(a + "+" + b + "+" + c  + "+"  + d + "=7"); 
        }else if(a + b + c - d == 7){
         	System.out.print(a + "+" + b + "+" + c  + "-"  + d + "=7"); 
        }else if(a + b - c + d == 7){
         	System.out.print(a + "+" + b + "-" + c  + "+"  + d + "=7"); 
        }else if(a + b - c - d == 7){
         	System.out.print(a + "+" + b + "-" + c  + "-"  + d + "=7"); 
        }else if(a - b - c + d == 7){
         	System.out.print(a + "-" + b + "-" + c  + "+"  + d + "=7"); 
        }else if(a - b - c - d == 7){
         	System.out.print(a + "-" + b + "-" + c  + "-"  + d + "=7"); 
        }else if(a - b + c + d == 7){
         	System.out.print(a + "-" + b + "+" + c  + "+"  + d + "=7"); 
        }else if(a - b + c - d == 7){
         	System.out.print(a + "-" + b + "+" + c  + "-"  + d + "=7"); 
        }
    
    }

}