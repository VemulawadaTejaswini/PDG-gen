import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int kosu=sc.nextInt();
		int ave=0;
		int kst=0;
		int kag=0;
		int sum=0;
		int wa=0;
		int[] aa=new int[kosu];
		for(int i=0; i<kosu; i++) {
			aa[i]=sc.nextInt();
			sum+=aa[i];
		}

		if(sum%kosu==0) {
			ave=sum/kosu;
		}
		else {
			kst=sum/kosu;
			kag=(sum+kosu-1)/kosu;
			if(kag*kosu-sum>=sum-kst*kosu) {
				ave=kst;
			}
			else {
				ave=kag;
			}
		}

		for(int i=0; i<kosu; i++) {
			wa+=(aa[i]-ave)*(aa[i]-ave);
		}
		System.out.println(wa);
	}
}