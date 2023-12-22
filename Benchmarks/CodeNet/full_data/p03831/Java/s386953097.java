import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();
		int[] mati=new int[kosu];
		int aru=sc.nextInt();
		int tlp=sc.nextInt();
		for(int i=0; i<kosu; i++) {
			mati[i]=sc.nextInt();
		}
		long costs=0;

		for(int i=0; i<kosu-1; i++) {
			int a=mati[i+1]-mati[i];
			if(a*aru>tlp) {
				costs+=tlp;
			}
			else {
				costs+=a*aru;
			}
		}
		System.out.println(costs);
	}
}