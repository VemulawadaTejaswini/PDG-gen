import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String boin= scan.next();
		if(boin == ("A") || boin == ("I") || boin == ("U") || boin == ("E") || boin == ("O")){
			System.out.println("母音");
		}
		else{
			System.out.println("子音");
		}
		

	}

}
