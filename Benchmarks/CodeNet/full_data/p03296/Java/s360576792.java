import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ary=sc.nextInt();
		int[] boxies=new int[ary];

		for(int i=0; i<ary; i++) {
			boxies[i]=sc.nextInt();
		}

		int[] boxies_copy=new int[ary];
		int mae_ary=boxies[0];
		int kosu=0;
		int renzoku=1;
		for(int i=1; i<ary; i++) {
			if(boxies[i]==mae_ary) {
				renzoku++;
			}
			else if(mae_ary!=boxies[i]) {
				kosu+=renzoku/2;
				renzoku=1;
				mae_ary=boxies[i];
			}

			if(i==ary-1) {
				kosu+=renzoku/2;
			}
		}
		System.out.println(kosu);
	}
}