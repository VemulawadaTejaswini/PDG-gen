import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        int X = sc.nextInt();
	        
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<=A; i++) {
			sum = 500*i;
			if(sum==X) {
				count++;
			}else if(sum<X) {
				for(int j=0; j<=B; j++) {
					int sum2 = sum;
					sum2 = sum2 + (100*j);
					if(sum2==X) {
						count++;
					}else if(sum2<X) {
						for(int h=0; h<=C; h++) {
							int sum3 = sum2;
							sum3 = sum3 + (50*h);
							if(sum3== X ) {
								count++;
							}
						}
					}
				}
			}
		}

     System.out.println(count);
	}

}
