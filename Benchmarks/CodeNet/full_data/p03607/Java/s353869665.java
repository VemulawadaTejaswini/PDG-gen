import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String called = ",";
		for(int i = 0; i < count; i++) {

			String call = sc.next();
			if(called.indexOf(","+call+",") != -1) {
				called = called.replace(","+call, "");
			}else {
				called += call+",";
			}
		}

		System.out.println(called.length() - (called.replace(",", "").length()+1));
		sc.close();
	}
}
