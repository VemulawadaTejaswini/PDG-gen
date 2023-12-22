import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] sort=new int[200000];
		int counter=0;
		while(sc.hasNext()) {
			sort[counter]=sc.nextInt();
			counter++;
		}
		int[] seikei=new int[counter];
		for(int i=0; i<counter; i++) {
			seikei[i]=sort[i];
		}
		sort=null;
		int[] copuy=new int[counter];
		copuy=seikei;

		Arrays.sort(copuy);

		int a=copuy[counter/2];
		int b=copuy[counter/2+1];

		for(int i=0; i<counter; i++) {
			if(seikei[i]<a) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
	}
}