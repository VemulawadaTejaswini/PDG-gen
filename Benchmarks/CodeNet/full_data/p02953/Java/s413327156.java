import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int H[] = new int[N];
		int flg = 0;
		
		for(int i=0;i<N;i++){
			H[i] = scan.nextInt();
		}
		
		if(H.length > 1){
			for(int i=0;i<(N-1);i++){
				if((H[i] > H[i+1]) && (flg==0)){
					H[i] = H[i]-1;
					flg = 1;
					if(H[i] > H[i+1]){
						System.out.println("No");
						flg = 2;
						break;
					}
				}else if((H[i] > H[i+1]) && (flg==1)){
					System.out.println("No");
					flg = 2;
					break;
				}
			}
			if(flg != 2){
				System.out.println("Yes");
			}
		}else{
			System.out.println("Yes");
		}
		
	}
}