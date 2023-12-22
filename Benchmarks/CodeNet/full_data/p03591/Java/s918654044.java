import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(s.length());
		if(s != null && s.length()>=4){
		
			if(s.substring(0,4).equals("YAKI")){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		else{
			System.out.println("No");
		}
	}

}
