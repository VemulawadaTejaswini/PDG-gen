import java.util.Scanner;

public class Main {
	
	private static final int INDEX = 0;
	
	public static void main(String[] args) {
		
		System.out.println("テストデータを入力してください");
		
		Scanner sc = new Scanner(System.in);
		
		String contestName = sc.nextLine();
		String[] sList = contestName.split(" ");
		
		for(int i = 0;i < sList.length;i++){
			
			char a = sList[i].charAt(INDEX);
			System.out.print(a);
		}
	}
}
