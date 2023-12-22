import java.util.Scanner;

public class Main {
	static int dev(int[] a,int an){
		boolean flg = false;
		for(int i = 0;i < a.length;i++){
			if(a[i]%2 == 0){
				flg = true;
				while(a[i]%2 == 0){
				a[i] /= 2;
				an++;
				}
				break;
			}
		}
		if(flg)
			return dev(a,an);
		else
			return an;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int na[] = new int[n];
		for(int i = 0; i < n; i++)
			na[i] = sc.nextInt();

		System.out.println(dev(na,0));

	}
}
