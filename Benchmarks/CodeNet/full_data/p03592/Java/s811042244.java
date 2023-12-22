import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] temp = s.split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		int K = Integer.parseInt(temp[2]);
		
		
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(K==(i*M+j*N-2*i*j)){
					flag = 1;
				}
			}
		}
		if(flag==1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}
