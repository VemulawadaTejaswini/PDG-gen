import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	boolean cha = (a <= 8 && b <=8);
 		
      	if(cha) System.out.println("Yay!");
      	else System.out.println(":(");
        
	}
}
