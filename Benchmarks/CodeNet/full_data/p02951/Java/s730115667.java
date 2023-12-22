import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int numA = sc.nextInt();
  	int numB = sc.nextInt();
  	int numC = sc.nextInt();
  	
  	int ans = numC - (numA - numB);
  	if(ans < 0) ans = 0;
  
  	System.out.println(ans);
  
	}
}