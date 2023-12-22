import java.util.*;
 
public class Main{
	public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    String result = a + b;
    int resultInt = parseInt(result);
    int ruseltSqrt = Math.sqrt(result) ;
      
    if(ruseltSqrt >= 1 && ruseltSqrt <= 10000){System.out.println("Yes");}
    else{System.out.println("No");}
    
    }
}