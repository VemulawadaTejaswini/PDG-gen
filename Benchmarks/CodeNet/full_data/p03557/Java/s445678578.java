import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] list1 = new int[n];
		int[] list2 = new int[n];
		int[] list3 = new int[n];
		for (int i = 0; i < n; i++) {
			list1[i]=s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			list2[i]=s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			list3[i]=s.nextInt();
		}
		Arrays.sort(list1);
		Arrays.sort(list2);
		Arrays.sort(list3);
		int count=0;
		for (int i = 0; i < list1.length; i++) {
			int num1=numOfBiggerElements(list2,list1[i]);
			if (num1==0) {
				break;
			}else{
				for (int j = list2.length-num1; j < list2.length; j++) {
					int num2 = numOfBiggerElements(list3,list2[j]);
					count +=num2;
				}	
			}
		}

		System.out.println(count);
		
		
	}
	
	public static int numOfBiggerElements(int[] arr, int target)
    {	
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>target) {
				count++; 
			}
		}
		return count;
    }
}
