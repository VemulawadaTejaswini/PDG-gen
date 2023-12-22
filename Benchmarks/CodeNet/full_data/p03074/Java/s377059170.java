import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int K=sc.nextInt();

		String S=sc.next();
		String[] str=(S).split("");

		int pre_pl=0;

		for(int k=0;k<K;k++) {

			int count0=0;
			int max=0;

			int max_pl=0;
			int pl=0;

			int min_pl=100001;

			if(str[0].equals("0")) count0=1;

			for(int i=1;i<N;i++){
				if(str[i-1].equals("1")) {
					if(str[i].equals("0")) {
						count0=1;
						pl=i;
					}
				}else {
					if(str[i].equals("0")) count0++;
					else{
						if(max<count0) {
							max=count0;
							max_pl=pl;
						}
						if(max==count0) {
							if(min_pl>Math.abs(max_pl-pre_pl)) {
								max=count0;
								max_pl=pl;
							}
						}
						count0=0;
					}
				}
			}

			// 入れ替え
			for(int i=max_pl;i<(max_pl+max);i++) {
				str[i]="1";
			}

			pre_pl=max_pl;


		}

		/*
		for(int i=0;i<N;i++) System.out.print(str[i]);
		System.out.println();
		*/

		int max=0;
		int count1=0;

		if(str[0].equals("1")) count1=1;

		for(int i=1;i<N;i++){
			if(str[i-1].equals("0")) {
				if(str[i].equals("1")) {
					count1=1;
				}
			}else {
				if(str[i].equals("1")) {
					count1++;
					if(i==N-1) {
						if(max<count1) {
							max=count1;
						}
					}
				}
				else{
					if(max<count1) {
						max=count1;
					}
					count1=0;
				}
			}
		}

		if(N==1) max=count1;

		System.out.println(max);

		sc.close();
	}

}
