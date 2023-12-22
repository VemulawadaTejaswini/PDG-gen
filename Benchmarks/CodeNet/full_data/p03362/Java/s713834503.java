import java.util.*;
import java.io.*;

public class Main{
	private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		int temp = n;
		int k = 2;
		int i=0;
		int sum = 0;

		while(temp >0){
			if(isPrime(k)){
				arr[i++] = k;
				sum+=k;
				temp--;	
			}
			k++;
		}

		while(true){
			if(!isPrime(sum)){
				for(int j=0; j<n; j++){
					System.out.print(arr[j] + " ");
				}
				break;
			}else{
				while(!isPrime(k))k++;
				sum = sum - arr[n-1] + k;
				arr[n-1] = k;
			}
		}

	}
}
