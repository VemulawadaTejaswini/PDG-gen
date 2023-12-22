import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[]a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		
		Deque<Integer> ad=new ArrayDeque<Integer>();
		
		for(int i=0;i<N;i++){
			if(i%2==N%2){
				ad.offerLast(a[i]);
			}else{
				ad.offerFirst(a[i]);
			}
		}
		for(Integer num : ad){
			System.out.print(num+" ");
		}
		System.out.println();
	}

}

