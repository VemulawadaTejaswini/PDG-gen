import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();

		long list[] = new long[target];

		for(int i=0;i<target;i++){
			list[i] = cin.nextLong();
		}

		long sum_tmp_minus=0L;
		long sum_tmp_plus=0L;
		long count_minus=0;
		long count_plus=0;

		for(int k=0;k<target;k++){
			sum_tmp_minus += list[k];
			if(k%2==0){
				if(sum_tmp_minus>=0){
					count_minus += sum_tmp_minus+1;
					sum_tmp_minus = -1;
				}
			}else{
				if(sum_tmp_minus<=0){
					count_minus += 1-sum_tmp_minus;
					sum_tmp_minus=1;
				}
			}
		}
		for(int l=0;l<target;l++){
			sum_tmp_plus += list[l];
			if(l%2==0){
				if(sum_tmp_plus<=0){
					count_plus += 1-sum_tmp_plus;
					sum_tmp_plus = 1;
				}
			}else{
				if(sum_tmp_plus>=0){
					count_plus += sum_tmp_plus+1;
					sum_tmp_plus=-1;
				}
			}
		}

		System.out.println(Math.min(count_minus, count_plus));

	}
}
