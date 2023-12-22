import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int input=sc.nextInt();
		int[] suji=new int[100001];

		for(int i=0; i<100001; i++) {
			suji[i]=0;
		}

		for(int i=0; i<input; i++) {
			suji[sc.nextInt()]++;
		}

		int[] wa=new int[100003];
		wa[0]=suji[0];		//-1
		wa[1]=suji[0]+suji[1];	//0
		wa[100001]=suji[99999]+suji[100000];	//100000
		wa[100002]=suji[100000];		//100001

		for(int i=2; i<=100000; i++) {
			wa[i]=suji[i-2]+suji[i-1]+suji[i];
		}

		int max=0;
		for(int i=0; i<=100002; i++) {
			if(max<wa[i]) {
				max=wa[i];
			}
		}

		System.out.println(max);
	}
}