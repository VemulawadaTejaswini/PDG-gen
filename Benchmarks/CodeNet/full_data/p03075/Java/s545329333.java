import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int k = s.nextInt();

		int[] f ={a,b,c,d,e,k};
		for(int i=0;i<f.length;i++){
			int n1=0;
			int n2=0;
			int ans=0;
			for(int j=0;j<f.length;j++){
				if(i==j){
					continue;
				}
				n1=f[i];
				n2=f[j];
				if(n1>n2){
					ans=n1-n2;
				}else{
					ans=n2-n1;
				};
				if(ans>k){
					System.out.println(":(");
					return;
				}
			};
		};
		System.out.println("Yay!");
	}

}
