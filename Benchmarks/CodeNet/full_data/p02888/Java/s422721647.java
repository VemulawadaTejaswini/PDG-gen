import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for(int i=0;i<n;i++){
			l[i] = sc.nextInt();
		}
		sc.close();
		int r = 0;
		for(int i=0;i<n-2;i++){
			for(int j=i+1;j<n-1;j++){
				for (int k=j+1;k<n;k++){
					int a = l[i];
					int b = l[j];
					int c = l[k];
					if(a<b+c && b<a+c && c<a+b) r++;
				}
			}
		}
		System.out.println(r);
	}
}
