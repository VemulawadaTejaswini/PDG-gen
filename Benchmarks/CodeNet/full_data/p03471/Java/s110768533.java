import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int x = -1;
		int y = -1;
		int z = -1;
		for(int i = 0; i <= n; i++){
			for(int j = n - i; j >= 0; j--){
				int tmp = sum -(i * 10000 + j * 5000);
				int tmpn = (n - i - j) * 1000;
				if(tmp == tmpn){
					x = i;
					y = j;
					z = n - i - j;
					j = -1;
					i = n;
				}
			}
		}
		System.out.println(x + " " + y + " " + z);
	}

}