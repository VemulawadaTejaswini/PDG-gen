import java.util.Scanner;

public class ABC068B {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		for(int i =N;i>=1;i--){
			if(i%2==0){
				System.out.println(i);
				break;
			}
		}

	}

}
