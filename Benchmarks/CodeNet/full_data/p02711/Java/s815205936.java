import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = "";

		s = sc.nextLine();

		String array[] = s.split("");

		if(array[0].equals("7") || array[1].equals("7") || array[2].equals("7")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}