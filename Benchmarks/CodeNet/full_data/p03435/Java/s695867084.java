import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		//		int N = scan.nextInt();
		//		int K = scan.nextInt();

		int data[] = new int[10];
		int x=0;
		for(int i = 1;i < 10;i++){
			data[i] = scan.nextInt();
		}
	

		for(int a = 0;a < 101;a++){
			for(int b = 0;b < 101;b++){
				for(int c = 0;c < 101;c++){
					
					for(int d = 0;d < 101;d++){
						if(data[1] == a + d &&data[4] == b + d &&data[7] == c + d){
							
							for(int e = 0;e < 101;e++){
								if(data[2] == a + e  && data[5] == b + e && data[8] == c + e ){

									for(int f = 0;f < 101;f++){
										if(  data[3] == a + f  && data[6] ==b  + f && data[9] == c + f) {
											System.out.println("Yes");
											return;
										}
									}
								}

							}
						}

					}

				}
				
			}
			








		}
			System.out.println("No");
	



	}
}