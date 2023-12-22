import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int h=sc.nextInt();
		int w=sc.nextInt();
		int a[][]=new int [h][w];
		int count=0;
		String m[]=new String[h*w];
		for (int i=0;i<h;++i){
			for (int j=0;j<w;++j){
				a[i][j]=sc.nextInt();
			}
		}

		for (int i=0;i<h;++i){
			for (int j=0;j<w-1;++j){
				if (a[i][j]%2==1){
					--a[i][j];
					++a[i][j+1];

					m[count]=((i+1)+" "+(j+1)+" "+(i+1)+" "+(j+2));
					++count;
				}
			}
			if (a[i][w-1]%2==1 && i!=h-1){
				--a[i][w-1];
				++a[i+1][w-1];
				m[count]=((i+1)+" "+w+" "+(i+2)+" "+w);
				++count;
			}
		}

		System.out.println(count);

		for (int i=0;i<count;++i){
			System.out.println(m[i]);
		}


	}
}