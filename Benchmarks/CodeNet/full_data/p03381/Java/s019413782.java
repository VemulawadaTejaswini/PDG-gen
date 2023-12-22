import java.util.Arrays;
import java.util.Scanner;

public class C_Many_Medians {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;

		//int swap;
		int zero=0;

		System.out.print("Nを入力：");

		number=sc.nextInt();

		int[] a=new int[number];
		int[] swap1=new int[number];



		for(int i=0;i<number;i++) {

			a[i]=sc.nextInt();

		}

		System.out.println();

	for(int j=0;j<number;j++) {

		for(int k=0;k<number;k++) {
			swap1[k]=a[k];
		}
		//swap=swap1[j];
		swap1[j]=zero;


		Arrays.sort(swap1);


		System.out.println(swap1[(number/2)]);

	}

	sc.close();

}

}
