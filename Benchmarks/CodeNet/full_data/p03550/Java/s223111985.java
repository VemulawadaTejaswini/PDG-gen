

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long z = sc.nextInt();
		long w = sc.nextInt();
		long[] array = new long[n];
		boolean teban = true; //真ならAの手番
		for(int j = 0;j < n;++j){
			array[j] = sc.nextLong();
		}
		for(int i = 0;i < n;++i){
			if(i+1 == n){
				if(teban){
					z = array[i];
				}else{
					w = array[i];
				}
				break;
			}
			if(teban){
				if(array[i+1] < array[i] && array[i] >= z){
					teban = false;
					z = array[i];
				}
			}else{
				if(array[i+1] < array[i] && array[i] >= w){
					teban = true;
					w = array[i];
				}
			}
		}
		System.out.println(Math.abs(z - w));
	}
}
