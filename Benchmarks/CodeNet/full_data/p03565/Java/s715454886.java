import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		char[] t = scanner.next().toCharArray();



		for(int i = s.length-t.length; i >= 0; i--){
			boolean flag = false;
			char[] temp = s;

			for(int j = 0; j < t.length; j++){
				if(s[i+j] == t[j] || s[i+j] == '?'){
					flag = true;
					temp[i+j] = t[j];
				}
			}

			if(flag){
				for(int j = 0; j < s.length; j++){
					if(temp[j] == '?'){
						temp[j] = 'a';
					}
					System.out.print(temp[j]);
				}
				System.out.println();
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}

