import java.util.*;

public class Main {
	int res = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int sumeven = 0;
		int sumodd = 0;
		int counteven = 0;
		int countodd = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			sumeven+=arr[i];
			sumodd+=arr[i];
			if (i%2==0) {
				if(sumeven>=0){
					counteven+=(1+sumeven);
					sumeven = -1;
				}
				if (sumodd<=0) {
					countodd+=(1-sumodd);
					sumodd = 1;
				}
			}else{
				if (sumeven<=0) {
					counteven+=(1-sumeven);
					sumeven = 1;
				}
				if (sumodd>=0) {
					countodd+=(1+sumodd);
					sumodd = -1;
				}
			}
		}
		
		
		System.out.println(counteven < countodd ? counteven : countodd);
	}
	
}
