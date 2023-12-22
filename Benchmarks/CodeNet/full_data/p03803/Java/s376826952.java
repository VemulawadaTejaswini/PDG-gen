import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
      	int b = scn.nextInt();
        if(a == 1){
        	a = 14;
        }
        if(b == 1){
        	b = 14;
        }
        if(a > b){
        	System.out.println("Alice");
        }else if(a < b){
        	System.out.println("Bob");
        }else{
        	System.out.println("Drow");
        }
	}
}