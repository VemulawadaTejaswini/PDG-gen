import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chiten=sc.nextInt();
		int[] zahyo=new int[chiten+2];
		zahyo[0]=0;
		zahyo[chiten+1]=0;
		long souwa=0l;
		for(int i=1; i<=chiten; i++) {
			zahyo[i]=sc.nextInt();
			souwa+=Math.abs(zahyo[i-1]-zahyo[i]);
		}
		souwa+=Math.abs(zahyo[chiten]-zahyo[chiten+1]);
		int diff=0;

		for(int i=1; i<=chiten; i++) {
			diff=Math.abs(zahyo[i-1]-zahyo[i+1])-(Math.abs(zahyo[i-1]-zahyo[i])+Math.abs(zahyo[i]-zahyo[i+1]));//本来の道
			System.out.println(souwa+diff);
		}
	}
}