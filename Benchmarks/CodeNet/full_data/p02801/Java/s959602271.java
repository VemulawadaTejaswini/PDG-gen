import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String C =sc.nextLine();
		String alpha[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int i=0;i<alpha.length;i++) {
			if(C.contentEquals(alpha[i])) {
				i ++;
				System.out.println(alpha[i]);
			}
		}
	}

}