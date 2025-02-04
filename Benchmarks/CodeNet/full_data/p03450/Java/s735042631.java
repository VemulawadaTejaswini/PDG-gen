import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] position = new long[N];
		for (int i=0;i<N;i++) {
			position[i] = -1;
		}
		for (long i=0;i<M;i++) {
			int positionA ,positionB;
			long D;
			positionA = sc.nextInt();
			positionB = sc.nextInt();
			D = sc.nextLong();
			if(position[positionA-1]==-1) {
				if (position[positionB-1]==-1) {
					position[positionA-1] = 500000000l;
					position[positionB-1] = D+500000000l;
				} else {
					long tempA = position[positionB-1]-D;
					if (tempA<0) {
						for (int j=0;j<N;j++) {
							if (position[j]!=-1) {
								position[j]+=Math.abs(tempA);
								if (position[j]>1000000000l) {
									System.out.println("No");
									return ;
								}
							}
						}
						position[positionA-1] = 0;
					} else {
						position[positionA-1] = tempA;
					}
				}
			} else if (position[positionB-1]==-1) {
				long tempB = position[positionA-1]+D;
				if (tempB>1000000000l) {
					for (int j=0;j<N;j++) {
						if (position[j]!=-1) {
							position[j]-=tempB -1000000000l;
							if (position[j]<0) {
								System.out.println("No");
								return ;
							}
						}
					}
					position[positionB-1] = 1000000000l;
				} else {
					position[positionB-1] = tempB;
				}
			} else {
				if (position[positionB-1]-position[positionA-1]!=D) {
					System.out.println("No");
					return ;
				}
			}
		}
		System.out.println("Yes");
	}
}