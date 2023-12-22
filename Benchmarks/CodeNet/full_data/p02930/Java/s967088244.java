


import java.util.Scanner;



public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1;i<=n-1;i++) {
			String[] str = new String[n-i];
			for (int j=i+1;j<=n;j++) {
				for (int k=0;k<10;k++) {
					if (((i^j)>>k)%2 != 0) {
						str[j-i-1]=Integer.toString(k+1);
						break;
					}
				}
			}
			System.out.println(String.join(" ", str));
		}
		
		
	}

	
}





