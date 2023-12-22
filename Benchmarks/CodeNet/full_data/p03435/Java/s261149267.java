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
		int  a= 0;
		int  b= 0;
		int  c= 0;
		int  d= 0;
		int  e= 0;
		int  f= 0;

		for(;a < 101;a++){
			for(;b < 101;b++){

				for(;c < 101;c++){
					for(;d < 101;d++){
						if(data[1] == a + d &&data[4] == b + d &&data[7] == c + d){

							for(;e < 101;e++){
								if(data[2] == a + e  && data[5] == b + e && data[8] == c + e ){

									for(;f < 101;f++){
										if(  data[3] == a + f 
												&& data[6] ==b  + f
												&& data[9] == c + f) {
											System.out.println("Yes");
											x ++;

										}
									}
								}

							}
						}

					}

				}
				
			}
			








		}
		if(x == 0){
			System.out.println("No");
		}




	}
}