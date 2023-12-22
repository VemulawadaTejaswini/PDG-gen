import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int Q = in.nextInt();
		
		long ans = 0;
		
		if (Q==1)
		{
			System.out.println(0);
		}else
		if (Q==2)
		{
			System.out.println(0);
		}
		else
		if (Q<=10) {
			System.out.println(0);
		}
		else 
		if (Q%2==0) {
			for (int i=Q/2;i<=N;i+=Q/2) {
				for (int j=Q/2;j<=N;j+=Q/2) {
					if ((i+j)%Q != 0)
						continue;
					else {				
						for (int k=Q/2;k<=N;k+=Q/2) {
							
							if ((k+j)%Q != 0||(k+i)%Q != 0)
								continue;
							else {
							
								ans++;
								//System.out.println(i + " " + j + " " + k);
							
							}
						}
					}
				}
			}
		} else {
			for (int i=Q;i<=N;i+=Q) {
				for (int j=Q;j<=N;j+=Q) {
					if ((i+j)%Q != 0)
						continue;
					else {				
						for (int k=Q;k<=N;k+=Q) {
							
							if ((k+j)%Q != 0||(k+i)%Q != 0)
								continue;
							else {
							
								ans++;
								//System.out.println(i + " " + j + " " + k);
							
							}
						}
					}
				}
			}
			
		}
		System.out.println(ans);

	}

}
