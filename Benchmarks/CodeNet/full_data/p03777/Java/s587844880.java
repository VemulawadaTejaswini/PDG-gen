import java.util.Scanner;

class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		sc.close();

		if((a.equals("H") && b.equals("H"))||(a.equals("D") && b.equals("D"))){
			System.out.print("H");
		}else if((a.equals("H") && b.equals("D"))||(a.equals("D") && b.equals("H"))){
			System.out.print("D");
		}
	}
}