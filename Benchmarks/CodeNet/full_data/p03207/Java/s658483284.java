import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 0;
		int max = 0;
		for(int k = 0; k < a; k++){
			int n2 = sc.nextInt();
			n += n2;
			if(max < n2){
				max = n2;
			}
		}
		n -= max/2;
		System.out.print(n);
	}
}
