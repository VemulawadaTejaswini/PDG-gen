import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] info=sc.nextLine().split(" ");
		int N=Integer.parseInt(info[0]),Y=Integer.parseInt(info[1])/1000;
		int[] ijk=new int[] {-1,-1,-1};
		for(int i=0;i<=N;i++) {
			for(int j=0;i+j<=N;j++) {
				if(10*i+5*j+(N-i-j)==Y) {
					ijk=new int[] {i,j,N-i-j};
					break;
				}
			}
		}
		System.out.println(ijk[0]+" "+ijk[1]+" "+ijk[2]);
	}
}