
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		
		ArrayList <Shop> al = new ArrayList<>();
		
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i= 0;i<N;i++) {
			line = sc.nextLine().split(" ");
			al.add(new Shop(Integer.parseInt(line[0]),Integer.parseInt(line[1]))); 
		}
		sc.close();
		
		al.sort((s1,s2)-> s1.a - s2.a );
		
		long amount =0;
		for(Shop s:al) {
			if(s.b<M) {
				amount += (long)s.a*s.b;
				M -= s.b;
			}else {
				amount += (long)s.a*M;
				break;
			}
		}
		
		System.out.println(amount);

	}

}

class Shop{
	int a;
	int b;
	
	public Shop(int a, int b) {
		this.a = a;
		this.b = b;
	}
}