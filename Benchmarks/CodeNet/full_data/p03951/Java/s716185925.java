import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int num[] = {x+1, 1, x, 2*n-1};
		if(x != 1 && x != 2*n-1){
			System.out.println("Yes");
			if(n == 2){
				for(int i = 1;i < 2*n;i++)System.out.println(num[i]);
			}else{
				for(int i = 1;i < 2*n;i++){
					if(num[0] != i && num[1] != i && num[2] != i && num[3] != i){
						System.out.println(i);
					}else if(i == n-2){
						for(int j = 0;j < num.length;j++){
							System.out.println(num[j]);
						}
					}
				}
			}
		}else{
			System.out.println("No");
		}

		sc.close();
	}
}
