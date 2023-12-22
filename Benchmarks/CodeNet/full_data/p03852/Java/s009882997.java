import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String boin= scan.next();
		if(boin.equals("A") || boin.equals("I") || boin.equals("U") || boin.equals("E") || boin.equals("O")){
			System.out.println("母音");
		}
		else{
			System.out.println("子音");
		}
		

	}

}