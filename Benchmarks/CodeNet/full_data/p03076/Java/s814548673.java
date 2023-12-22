import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	int count = 129;
	int number = 0;
	int sum = 0;
		for(int i=0; i<5; i++){
		arr[i] = sc.nextInt();
			if(arr[i]%10!=0 && arr[i]%10<=count%10){
			count = arr[i];
			number = i;
			}
			if(arr[i]%10==0){
			sum = sum + arr[i];
			}
			if(arr[i]%10!=0){
			sum = sum + (arr[i]/10+1)*10;
			}
		}
		if(count!=129){
		sum = sum - (10-arr[number]%10);
		}
	System.out.println(sum);
	}
}
	