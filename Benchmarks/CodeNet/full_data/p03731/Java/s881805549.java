import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int N = cin.nextInt();
		long T = cin.nextLong();


		long before = cin.nextLong();
		long tmp;
                if(N>1){
                    tmp = cin.nextLong();
                }else{
                    tmp = 0L;
                }
		long sum =0L;

		for(int i=0;i<N-1;i++){
			if(tmp-before<T){
				sum += T-(tmp-before);
			}
			if(i<N-2){
				before = tmp;
				tmp = cin.nextLong();
			}
		}
		System.out.println(N*T-sum);
	}
}
