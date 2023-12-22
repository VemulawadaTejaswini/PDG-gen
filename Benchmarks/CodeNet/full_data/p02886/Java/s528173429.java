import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < a; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < a - 1; i++){
			for(int j = i + 1; j < a; j++){
				sum += arr[i] * arr[j];
			}
		}
		System.out.println(sum);
	}

	}