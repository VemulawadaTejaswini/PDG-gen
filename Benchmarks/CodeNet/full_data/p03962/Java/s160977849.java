import java.util.Scanner;



class Main{
	public static void main(String[] main) {
		Scanner sc=new Scanner(System.in);
		boolean[] unko=new boolean[101];
		for(int i=0; i<101; i++) {
			unko[i]=false;
		}
		for(int i=0; i<3; i++) {
			unko[sc.nextInt()]=true;
		}
		int kosu=0;
		for(int i=0; i<=100; i++) {
			if(unko[i]) {
				kosu++;
			}
		}
		System.out.println(kosu);
	}
}