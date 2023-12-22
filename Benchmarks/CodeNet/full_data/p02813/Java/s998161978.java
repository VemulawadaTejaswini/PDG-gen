import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] Q = new int[N];
		boolean flg = true;
		int[] numbers = new int[N];
		int[] bestNumbers = new int[N];
		int a = 0;
		int b = 0;
		int buf = 0;
		int ans = -1;
		for(int i = 0;i < N;i++){
			P[i] = sc.nextInt();
			numbers[i] = i + 1;
			bestNumbers[i] = N - i;
		}
		for(int i = 0;i < N;i++){
			Q[i] = sc.nextInt();
		}
		while(flg){
			flg = false;
			for(int i = N - 1;i > 0;i--){
				buf++;
				if(Arrays.equals(numbers,P)){
					a = buf;
				}else if(Arrays.equals(numbers,Q)){
					b = buf;
				}else if(Arrays.equals(bestNumbers,numbers)){
					break;
				}
				if(numbers[i] > numbers[i - 1]){
					swap(numbers,i,i - 1);
					flg = true;
					break;
				}else{
					ultimateSort(numbers,i - 2);
					flg = true;
					break;
				}
			}
		}
		
		ans = Math.abs(a - b);
		System.out.println(ans);
	}
	public static void swap(int[] a,int i,int j){
		int buf = a[i];
		a[i] = a[j];
		a[j] = buf;
	}
	public static void ultimateSort(int[] a,int head){
		int N = a.length;
		for(int i = head + 1;i < N;i++){
			if(a[i] == a[head] + 1){
				swap(a,head,i);
				break;
			}
		}
		Arrays.sort(a,head + 1,N);
	}
}