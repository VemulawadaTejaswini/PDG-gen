import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}		
		int sum = 0;
		int count = 0;
		for(int i=0;i<size;i++){
			for(int j=i;j<size;j++){
				sum += arr[j];
				if(sum == 0){
					count++;
				}
			}
			sum=0;
		}
		System.out.println(count);
	}

}
