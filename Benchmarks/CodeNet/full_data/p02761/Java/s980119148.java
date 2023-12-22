import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
//		String S = sc.next();

		int[] arr = new int[N];
		for(int i = 0; i< N ; i++) {
			arr[i] = 10;
		}
		for(int i = 0; i<M ; i++) {
			int aa = Integer.parseInt(sc.next());
			int bb = Integer.parseInt(sc.next());

			if(aa ==1 && bb == 0) {
				System.out.println(-1);
				return;
			}
			if(arr[aa-1] != 10 && arr[aa-1] != bb) {
				System.out.println(-1);
				return;
			} else {
				arr[aa-1] =  bb;
			}
		}


		for(int i=0;i < arr.length;i++) {
			if(i==0 && arr[i] == 10) {
				System.out.print(1);
			} else if(arr[i] == 10) {
				System.out.print(0);
			} else {
				System.out.print(arr[i]);
			}
		}
	}
}
