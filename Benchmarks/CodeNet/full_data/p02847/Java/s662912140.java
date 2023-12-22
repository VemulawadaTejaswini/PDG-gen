import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		if(n.equals("SUN")){
			System.out.println("7");
		}else if(n.equals("MON")){
			System.out.println("6");
		}else if(n.equals("TUE")){
			System.out.println("5");
		}else if(n.equals("WED")){
			System.out.println("4");
		}else if(n.equals("THU")){
			System.out.println("3");
		}else if(n.equals("FRI")){
			System.out.println("2");
		}else if(n.equals("SAT")){
			System.out.println("1");
		}
	}
}