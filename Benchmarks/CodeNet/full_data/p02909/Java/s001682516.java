import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = null;
		if(a.equals("Sunny")){
			b = "Cloudy";
		}
		if(a.equals("Cloudy")){
			b = "Rainy";
		}
		if(a.equals("Rainy")){
			b = "Sunny";
		}
		System.out.print(b);
	}

}
