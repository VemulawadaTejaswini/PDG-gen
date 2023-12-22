import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] antennas=new int[5];
		int k;
		int ans=0;

		for(int i=0;i<5;i++) {
			antennas[i]=sc.nextInt();
		}
		k=sc.nextInt();

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) continue;
				if(antennas[i]<antennas[j]) {
					if(antennas[j]-antennas[i]>k) ans++;
				}
			}
		}

		if(ans==0) System.out.println("Yay!");
		else System.out.println(":(");

		sc.close();
	}
}
