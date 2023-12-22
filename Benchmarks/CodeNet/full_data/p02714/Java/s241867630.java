import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();

		int cnt = 0;
		for(int i = 0; i < n-2; i++){
			for(int j = i+1; j < n-1; j++){
				if(s.charAt(i) != s.charAt(j)){
					for(int k = j+1; k < n; k++){
						if(s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k)){
							if(j-i != k-j){
								cnt++;
							}
						}
					}

				}
			}
		}
		System.out.println(cnt);
	}

}