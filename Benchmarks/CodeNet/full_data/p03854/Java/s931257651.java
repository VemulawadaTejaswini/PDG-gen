import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
        String T = "";
        String[] str = {"dream","dreamer","erase","eraser"};
		
		S = S.replace("eraser", "").replace("erase", "").replace("dreamer", "").replace("dream", "");
		
		if( S.equals("")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}