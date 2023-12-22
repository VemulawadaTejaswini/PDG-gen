import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] L=new int[N];
		int max=0;int mi=0;
		for(int i=0;i<N;i++) {
			L[i]=sc.nextInt();
			if(L[i]>max) {max=L[i];mi=i;}
		}
		int S=0;
		for(int i=0;i<N;i++) {
			if(i!=mi)S+=L[i];
		}
		String str="No";
		if(S>max)str="Yes";
		
		
		System.out.println(str);
	}

}
