import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int sum = sc.nextInt();
		int ct = 0;
		for(int i = 0; i <= max; i++){
			for(int j = 0; j<= max; j++){
				int tmp = i + j;
				for(int k = 0; k <= max; k++){
					int m = tmp + k;
					if(m == sum){
						ct++;
					}
				}
			}
		}
		System.out.println(ct);
	}
}