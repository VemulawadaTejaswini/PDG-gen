import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		String line = sc.nextLine();
		
		if(line == "A") {
			System.out.println("T");
		}else if(line == "T"){
			System.out.println("A");
		}else if(line == "C"){
			System.out.println("G");
		}else if(line == "T"){
			System.out.println("A");
		}else if(line == "G"){
			System.out.println("C");
		}
		
	}

}

