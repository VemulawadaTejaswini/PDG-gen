import java.util.Scanner;

public class  Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
      if(a < 9 && b <9 ){
 		System.out.println("Yay!");}
      else{
      	System.out.println(":(");
      }
		sc.close();
    }
}