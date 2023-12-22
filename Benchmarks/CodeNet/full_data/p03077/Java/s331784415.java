Vimport java.util.*;
public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int arr[] = new int[5];
		for(int i=0; i<5; i++){
		arr[i] = sc.nextInt();
		}
	Arrays.sort(arr);
	int ans;
		if(N%arr[0]>0){
		ans = 5+N/arr[0];
		}
		else{
		ans = 4+N/arr[0];
		}
	System.out.println(ans);
	}
}
 
		