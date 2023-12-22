import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//input
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		//method
		for(int i=0; i<a.length; i++){
			for(int j=1; j<a.length; j++){
				int diff = Math.abs(a[i]-a[j]);
				if(diff>max){
					max = diff;
				}
			}
		}
		System.out.println(max);
	}
}