import java.util.Scanner;
public class Main{

	public static void main(String[] args){

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int [] number = new int[N];
		for (int index=0; index<N; index++) {
			number[index]=sc.nextInt();
		}

		for (int index=0; index<N-1; index++) {
			if (number[index]<=0&&number[index+1]<=0) {
				number[index]=Math.abs(number[index]);
				number[index+1]=Math.abs(number[index+1]);
			} else if (number[index]>=0&&number[index+1]>=0) {

			} else if (number[index]<0&&number[index+1]>0) {
				if(Math.abs(number[index])>=number[index+1]) {
					number[index]=Math.abs(number[index]);
					number[index+1]-=number[index+1]*2;
				}
			} else {
				if(Math.abs(number[index])<=number[index+1]) {
					number[index]=Math.abs(number[index]);
					number[index+1]-=number[index+1]*2;
				}
			}
		}
		long total = 0;
		for (int index=0; index<N; index++) {
			total+=number[index];
		}
		System.out.println(total);
	}
}