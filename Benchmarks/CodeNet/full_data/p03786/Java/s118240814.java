import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int total = 0;


		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			b[i]=a[i];
			total +=a[i];
		}

		int size;
		int ans = 0;

		for(int i=0;i<n;i++){
			size = a[i];
			for(int j=0;j<n;j++){
				if(size*2 >= a[j] && a[j] != 0 && j != i){
					size += a[j];
					a[j] = 0;
					j = 0;
				}
				if(size == total){
					ans++;
					break;
				}

			}

			for(int k=0;k<n;k++){
				a[k]=b[k];
			}

		}

		System.out.println(ans);


	}

}
