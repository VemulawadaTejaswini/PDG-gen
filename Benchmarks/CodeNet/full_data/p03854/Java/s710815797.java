import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int judge = 0;

		while(true){
			judge = 0;
			if(S.length() >= 7 && judge == 0){
				if("dreamer".equals(S.substring(S.length() - 7))){
					S = S.substring(0, S.length() - 7);
					judge = 1;
				}
			}
			if(S.length() >= 6 && judge == 0){
				if("eraser".equals(S.substring(S.length() - 6))){
					S = S.substring(0, S.length() - 6);
					judge = 1;
				}
			}
			if(S.length() >= 5 && judge == 0){
				if("dream".equals(S.substring(S.length() - 5))){
					S = S.substring(0, S.length() - 5);
					judge = 1;
				}else if("erase".equals(S.substring(S.length() - 5))){
					S = S.substring(0, S.length() - 5);
					judge = 1;
				}
			}
			if("".equals(S)){
				System.out.println("YES");
				break;
			}else if(judge == 0){
				System.out.println("NO");
				break;
			}
		}
	}

}
