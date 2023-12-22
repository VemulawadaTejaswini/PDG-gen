import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int k=sc.nextInt();
		int[] rabbits=new int[k+1];
		for(int i=0;i<k;i++)
			rabbits[i+1]=sc.nextInt();
		int count=0;
		for(int i=1;i<=k;i++){
			int tar=rabbits[i];
			int tar2=rabbits[tar];
			if(tar2==i) count++;
		}
		System.out.println(count/2);
	}
}
