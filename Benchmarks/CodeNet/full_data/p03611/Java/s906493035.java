import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] a = new int[100000];
		for(int i=0;i<100000;i++) a[i] = 0;
		for(int i=0;i<N;i++){
			int temp = sc.nextInt();
			if(temp>0){
				a[temp-1]++;
			}
			a[temp]++;
			if(temp<N){
				a[temp+1]++;
			}
		}
		int max = 0;
		for(int i=0;i<100000;i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
