
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int gc = 0, pc = 0, score =0;
		for(int i=0;i<S.length();i++){
			if(pc < gc){
				if(S.charAt(i)=='g'){
					score++;
					pc++;
				}else{
					pc++;
				}
			}else{
				if(S.charAt(i)=='g'){
					gc++;
				}else{
					score--;
					gc++;
				}
			}
		}
		System.out.println(score);
	}

}
