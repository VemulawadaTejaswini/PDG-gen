import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		long table[]=new long[N];
		for (int j = 0; j < N; j++) {
            table[j]= sc.nextInt();
        }
		long sum=0;
		long hantei=1;

		//奇数列か偶数列判定
		for(int j = 0; j < N; j++)
			hantei*=table[j];

		//偶数列の場合
		if(hantei>=0) {
			for(int j = 0; j < N; j++) {
				if(table[j]>=0)
					sum+=table[j];
				else
					sum-=table[j];
			}
		}

		//奇数列の場合
		else {
			//最小値判定
			long hantei2=1000000000;
			int key=0;
			for(int j = 0; j < N; j++) {
				if(table[j]>=0) {
					if(hantei2>=table[j]) {
						hantei2=table[j];
						key=j;
					}
				}
				else {
					if(-hantei2<table[j]) {
						hantei2=-table[j];
						key=j;
					}
				}
			}

			for(int j = 0; j < N; j++) {
				if(table[j]>=0)
					sum+=table[j];
				else
					sum-=table[j];
			}
			if(table[key]>=0)
				sum-=table[key]*2;
			else
				sum+=table[key]*2;
		}
		System.out.println(sum);

		sc.close();
	}

}
