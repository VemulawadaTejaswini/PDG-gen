import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int freq = 1;
		int num = arr[n-1];
		int dim = 0;	
		int area = 0;
		
		for(int i=n-2; i>=0; i--){
			if(	num == arr[i]){
				freq++;
			}else{
				if(freq >= 4 && area == 0){
					area = num*2;
					System.out.println(area);
					break;
				}else if(freq >=2 && area == 0){
					area = num;
					dim++;
					num = arr[i];
					freq = 1;
				}else if(freq >=2 && area != 0){
					area = area * num;
					System.out.println(area);
					dim = 0;
					break;
				}else{
					num = arr[i];
					freq = 1;
				}
			}
		}
		if(freq >= 4 && area == 0){
			System.out.println(num*2);
		}else if(dim ==1 && freq >=2){
			area = area*num;
			System.out.println(area);
		}else{
			System.out.println("0");
		}
	}
}