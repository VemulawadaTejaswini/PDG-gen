import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int keta = String.valueOf(b).length();
		int ans = (int)Math.pow(10, keta) * a + b;


		for(int i = 1;i < ans/2;i++){
			if(i*i == ans){
				System.out.println("Yes");
				return;

			}
		}
		System.out.println("No");





	}
}




class Graph{
	int from;
	int to;
	int cost;

	public Graph() {
	}

	public Graph(int f,int t,int c) {
		from = f;
		to= t;
		cost = c;
	}
}
