import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int D=sc.nextInt();

		int[][] X=new int[N][D];

		for(int i=0;i<N;i++){
			for(int j=0;j<D;j++) X[i][j]=sc.nextInt();
		}

		int ans=0;

		for(int i=0;i<N-1;i++){

			for(int k=i+1;k<N;k++){

				double d=0.0;

				for(int j=0;j<D;j++){
					d+=Math.pow(Math.abs(X[i][j]-X[k][j]),2);
				}

				d=Math.sqrt(d);

				//System.out.println(d);

				String[] str=(String.valueOf(d)).split("");

				int len=str.length;

				if(str[len-2].equals(".") && str[len-1].equals("0")) ans++;
			}

		}

		System.out.println(ans);

		sc.close();
	}


}
