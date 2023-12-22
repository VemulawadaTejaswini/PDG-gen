import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int arr[] = new int[5];
		for(int i=0; i<5; i++){
		arr[i] = sc.nextInt();
		}
	int N_min = arr[0];
		for(int i : arr){
			if(N_min > i){
			N_min = i;
			}
		}
	int ans;
		if(N%N_min>0){
		ans = 5+N/N_min;
		}
		else{
		ans = 4+N/N_min;
		}
	System.out.println(ans);
	}
}
 
		