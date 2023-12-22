import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		int count = 0;
		for(int i = 0 ;i<=str.length();i++){
			if(str.charAt(i)=='o'){
				count++;

			}

		}

		if(count >=8){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}


	}
}
