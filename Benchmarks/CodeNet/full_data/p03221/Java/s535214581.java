import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M=sc.nextInt();
		int years[]=new int[M];
		int ken[]=new int[M];
		int num[]=new int[M];
		//ArrayList<City> Cities=new ArrayList<City>();
		//ArrayList<City> sorted=new ArrayList<City>();
		// スペース区切りの整数の入力
		for(int i=0;i<M;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			int k=1;
			years[i]=c;
			ken[i]=b;
			for(int j=0;j<i;j++) {
				if(ken[j]==b) {
					if(years[j]<c) {
						k++;
					}else {
						num[j]=num[j]+1;
					}
				}
			}
			num[i]=k;
		}
		for(int i=0;i<M;i++) {
			System.out.printf("%06d%06d\n", ken[i],num[i]);
		}
		// 文字列の入力
		//String s = sc.next();

	}
}