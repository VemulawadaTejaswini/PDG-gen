import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++){
			if(i % 2 == 1){
				int ct = 0;
				for(int j=1; j<=n; j++){
					if(i % j == 0){ct++;}
				}
				if(ct == 8){count++;}
			}
		}
		System.out.println(count);
	}
}
