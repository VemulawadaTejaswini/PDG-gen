
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		ArrayList<Integer> listA = new ArrayList<>();
		for(int i=0;i<N;i++) {
			listA.add(sc.nextInt());
		}
		
		int count=0;
		for(int i=1;i<=M;i++) {
			boolean flag = true;
			for(int j=0;j<N;j++) {
				if(!(isOddAndPlus(2*i/listA.get(j)))){
					flag = false;
					break;
				}
			}
			if(flag){
				count++;
			}
		}
		System.out.println(count);
	}
	
	static boolean isOddAndPlus(int n) {
		if(n%2==1 && n/2>=0) {
			return true;
		}else{
			return false;
		}
	}

}
