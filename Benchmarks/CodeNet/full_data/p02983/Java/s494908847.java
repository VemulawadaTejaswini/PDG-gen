import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		long min = 2019;

		for(int i=0; i<2019; i++){
			long x = l+i;
			for(int j=i+1; j<2019; j++){
				long y = l+j;
				if(x>r || y>r) break;
				min = Math.min(min, (x*y)%2019);
			}
		}
		System.out.println(min);

	}
}
