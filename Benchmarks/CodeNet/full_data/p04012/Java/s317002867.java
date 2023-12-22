import java.util.Arrays;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		char[] cs = string.toCharArray();
		Arrays.sort(cs);
		int count = 1;
		for(int i = 0;i < string.length()-1;i++){
			if(cs[i] == cs[i+1]){
				count++;
			}else{
				if(count%2 != 0){
					System.out.println("No");
					return;
				}
				count = 1;
			}
		}
		if(count%2 != 0){
			System.out.println("No");
			return;
		}else{
			System.out.println("Yes");
		}

	}
}