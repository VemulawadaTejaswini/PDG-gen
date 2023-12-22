import java.util.Scanner;

//6/9コンテスト

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		//List<Integer> list= new ArrayList<Integer>();
		int nokori=n-k;
		if(k==1) {
			System.out.println("0");
		}
		else{
			System.out.println(nokori);
		}




	}

}
