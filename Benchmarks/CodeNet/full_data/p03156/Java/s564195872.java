import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		int[] prob = new int[3];
		for(int i = 0; i < N; i++) {
			int P = sc.nextInt();
			if(P <= A) prob[0]++;
			else if(P > B) prob[2]++;
			else prob[1]++;
		}
		System.out.println(Math.min(prob[0], Math.min(prob[1], prob[2])));
	}
}