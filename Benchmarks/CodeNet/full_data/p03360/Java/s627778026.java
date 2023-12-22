
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] kokuban=new int[3];
		for(int i=0;i<3;i++) {
		try{kokuban[i]=sc.nextInt();}
		catch(Exception e) {//System.out.print(e);
		System.exit(1);}
		}
		int K=0;
		try {K=sc.nextInt();}
		catch(Exception e) {//System.out.print(e);
		System.exit(1);}

	/*	for(int i=0;i<3;i++) {
			System.out.print(kokuban[i]+" ");
			}
*/
		//System.out.println("");
		//System.out.println(K);
		for(int i=0;i<3;i++) {
		if(kokuban[i]<1||kokuban[i]>50) {
			//System.out.println(i+"番目の値が不正です");
			System.exit(1);
			}
		}
		if(K<1||K>10) {
			//System.out.println("Kの値が不正です");
			System.exit(1);
			}
		int max=-1;
		for(int z=0;z<K;z++) {
		if(kokuban[0]>=kokuban[1]&&kokuban[0]>=kokuban[2]) {max=0;}
		else if(kokuban[1]>=kokuban[2]&&kokuban[1]>=kokuban[0]) {max=1;}
		else if(kokuban[2]>=kokuban[0]&&kokuban[2]>=kokuban[0]) {max=2;}
		kokuban[max]*=2;
		}
		int sum=0;
		for(int i=0;i<3;i++)sum+=kokuban[i];
		System.out.print(sum);
		}
	}
