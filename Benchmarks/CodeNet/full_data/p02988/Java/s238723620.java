package sd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=in.nextInt();
		}
		int sum=0;
		for (int i = 0; i < n-2; i++) {
			int min=arr[i+1];
			int[] s={arr[i],arr[i+1],arr[i+2]};
			Arrays.sort(s);
			int min2=s[1];
//			System.out.println(Arrays.toString(s)+"  "+min+"  "+min2);
			if(min==min2){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
