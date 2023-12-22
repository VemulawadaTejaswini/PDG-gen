import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Sei = sc.nextLine();
		String[] array = Sei.split("/");
		String Str = "";
		for(int i = 0;i < array.length;i++) {
			Str +=array[i];
		}
		int in = Integer.parseInt(Str);
		if(in <= 20190430) {
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}
	}

}
