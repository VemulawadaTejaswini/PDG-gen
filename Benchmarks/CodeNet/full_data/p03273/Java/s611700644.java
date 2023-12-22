import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		String s[]=new String[h];
		char c[][] = new char[h][w];
		boolean isvirtical[]=new boolean[w];
		boolean ishorizontal[]=new boolean[h];


		for(int i=0;i<h;++i){
			s[i]= sc.next();
			c[i]=s[i].toCharArray();
		}

		for (int i=0;i<h;++i){
			ishorizontal[i]=true;
			for (int j=0;j<w&&ishorizontal[i]==true;++j){
				if (c[i][j]=='#' ) ishorizontal[i] = false;
			}
		}


		for (int i=0;i<w;++i){
			isvirtical[i]=true;
			for (int j=0;j<h&&isvirtical[i]==true;++j){
				if (c[j][i]=='#' ) isvirtical[i] = false;
			}


		}
		for (int i=0;i<h;++i){
			if (ishorizontal[i]==false){
				for(int j=0;j<w;++j){
					if(isvirtical[j]==false){
						System.out.print(c[i][j]);
					}
				}
				if(i!=h)System.out.println();

			}
		}

	}
}