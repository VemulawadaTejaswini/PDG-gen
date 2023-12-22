import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ary=sc.nextInt();
		int[] boxies=new int[ary];

		for(int i=0; i<ary; i++) {
			boxies[i]=sc.nextInt();
		}

		int kisu=0;
		int gusu=0;
		int[] boxies_copy=new int[ary];
		boxies_copy=boxies;

		for(int i=1; i<ary; i+=2) {
			if(i==ary-1) {
				if(boxies[i]==boxies[i-1]) {
					gusu++;
					boxies[i]=0;
				}
			}
			else {
				if(boxies[i-1]==boxies[i] || boxies[i+1]==boxies[i]) {
					gusu++;
					boxies[i]=0;
				}
			}
		}

		boxies=boxies_copy;

		for(int i=0; i<ary; i+=2) {
			if(i==ary-1) {
				if(boxies[i]==boxies[i-1]) {
					kisu++;
					boxies[i]=0;
				}
			}

			else if(i==0) {
				if(boxies[i]==boxies[i+1]) {
					kisu++;
					boxies[i]=0;
				}
			}
			else {
				if(boxies[i-1]==boxies[i] || boxies[i+1]==boxies[i]) {
					kisu++;
					boxies[i]=0;
				}
			}
		}
		System.out.println(Math.min(kisu, gusu));
	}
}