
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int[] p=new int[N];

		for(int i=0;i<N;i++) p[i]=sc.nextInt();

		sc.close();

		int cnt=0;

		for(int i=0;i<N-2;i++){

			int second=min_2(p[i],p[i+1],p[i+2]);

			if(p[i+1]==second) cnt++;
		}

		System.out.println(cnt);

	}

	public static int min_2(int a,int b,int c){

		int[] box=new int[3];

		box[0]=a;
		box[1]=b;
		box[2]=c;

		Arrays.sort(box);

		return box[1];
	}
}
