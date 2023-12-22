import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();
		String[] arare= {"P","W","G","Y"};
		int[] syr= {0,0,0,0};
		String tmp="";

		for(int i=0; i<kosu; i++) {
			tmp=sc.next();
			for(int j=0; j<4; j++) {
				if(tmp.equals(arare[j])) {
					syr[j]++;
				}
			}
		}
		int syuruisu=0;
		for(int i=0; i<4; i++) {
			if(syr[i]>0) {
				syuruisu++;
			}
		}
		if(syuruisu==4) {
			System.out.println("Four");
		}

		else if(syuruisu==3) {
			System.out.println("Three");
		}
	}
}