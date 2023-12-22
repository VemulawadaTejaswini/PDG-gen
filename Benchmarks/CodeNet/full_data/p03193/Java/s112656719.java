import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[] a = new int[n];
		int[] b =new int[n];
		int count = 0;
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if(a[i] >= h && b[i] >= w){
				count++;
			}
		}
		System.out.println(count);
	}
}