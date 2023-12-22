import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Z = scan.nextInt();
		int W = scan.nextInt();
		int cNum = 1;
		int[] a = new int[N-1];
      	a[0] = scan.nextInt();
      	int counter = a[0];
		for(int i=1;i<N-1;i++){
			a[i] = scan.nextInt();
			if(counter <= a[i]){
				counter = a[i];
				cNum = i + 1;
			}
		}
		Z = counter;
      	if(cNum < N){
			for(int i=cNum;i<N-1;i++){
				if(Math.abs(Z - a[i]) < Math.abs(Z - W)){
					W = a[i];
				}
			}
        }
		System.out.println(Math.abs(Z - W));
		

	}

}