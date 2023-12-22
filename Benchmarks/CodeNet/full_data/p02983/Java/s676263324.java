import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int min1 = a;
      	int min2 = b;
      	int pointer = a;
      	sc.close();
      	while(a > 2019){
        	a = a - 2019;
          	b = b - 2019;
        }
      	int wa = a % 2019;
        int wb = b % 2019;
      	System.out.print(wa * wb);
    }
 
}