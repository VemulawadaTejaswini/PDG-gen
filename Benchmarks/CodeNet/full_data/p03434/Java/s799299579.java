import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] suujis=new int[a];
		for(int i=0; i<a; i++) {
			suujis[i]=sc.nextInt();
		}

		int tmp1=0;
		int tmp2=0;
		for(int i=0; i<a; i++) {
			for(int j=i; j<a; j++) {
				if(suujis[i]<suujis[j]) {
					tmp1=suujis[i];
					tmp2=suujis[j];
					suujis[j]=tmp1;
					suujis[i]=tmp2;
				}
				else {
				}
			}
		}
		int you=0;
		int opp=0;
		for(int i=0; i<a; i++) {
			if(i%2==0) {
				you+=suujis[i];
			}
			else {
				opp+=suujis[i];
			}
		}
		System.out.println(you-opp);
	}
}