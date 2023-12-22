import java.util.Arrays;
import java.util.Scanner;

class Main{

	static int[] a;
	static	int N ;

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		a = new int[N];
		for(int i = 0;i < a.length;i++){
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		
		
		int[] data = new int [100000];
		for(int i = 0;i <a.length;i++){
			data[a[i]]++;
		}

		int ans = 0;

		for(int i = 1;i < data.length-1;i++){
			ans = Math.max(ans, data[i]+data[i+1]+data[i -1]);
			
		}
		
//		
//		for(int i = 0;i < a.length;i++){
//			int count1 = 0;
//			int count2 = 0;
//			int count3 = 0;
//
//			int k = a[i];
//
//			for(int j = 0;j < a.length;j++){
//				if(Math.abs(a[j] - k)<= 1){
//					count1++;
//				}	
//				if(a[j] > k + 1){
//					break;
//				}
//			}
//			for(int j = 0;j < a.length;j++){
//				if(Math.abs(a[j] - (k - 1))<= 1){
//					count2++;
//				}	
//				if(a[j] > k + 2){
//					break;
//				}
//			}
//			for(int j = 0;j < a.length;j++){
//				if(Math.abs(a[j] - (k + 1))<= 1){
//					count3++;
//				}	
//				if(a[j] > k - 1){
//					break;
//				}
//			}
//			
//
//			ans = Math.max(ans, Math.max(count1, Math.max(count2, count3)));
//
//
//		}
		
		System.out.println(ans);


	}


}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



