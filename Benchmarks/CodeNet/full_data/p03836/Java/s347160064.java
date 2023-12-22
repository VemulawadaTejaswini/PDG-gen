import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x=new int[2];
		int[] y=new int[2];
		for(int i=0;i<2;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		int xdif=x[1]-x[0];
		int ydif=y[1]-y[0];
		String ans="";
		for(int i=0;i<xdif;i++){
			ans+="R";
		}
		for(int i=0;i<ydif;i++){
			ans+="U";
		}
		for(int i=0;i<xdif;i++){
			ans+="L";
		}
		for(int i=0;i<ydif;i++){
			ans+="D";
		}
		ans+="D";
		for(int i=0;i<xdif+1;i++){
			ans+="R";
		}
		for(int i=0;i<ydif+1;i++){
			ans+="U";
		}
		ans+="LU";
		for(int i=0;i<xdif+1;i++){
			ans+="L";
		}
		for(int i=0;i<ydif+1;i++){
			ans+="D";
		}
		ans+="R";
		System.out.println(ans);
	}
}