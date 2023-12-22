import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
      	int c = X / 100;
		int x = X % 100;
      
      	if(c>=20){
          System.out.println("1");
        }else if(x>c*5){
          System.out.println("0");
        }else{
          System.out.println("1");
        }
    }
}
      	