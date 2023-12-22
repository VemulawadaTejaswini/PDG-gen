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
			int pos1 = position(list2, list1[i]);
			for (int j = pos1; j < list2.length; j++) {
					int num = position(list3, list2[j]);
					count += list3.length-num;
				}	
		}
		System.out.println(count);

	}
	
	public static int indexOfLastApperance(int[] arr, int pos){
		for (int i = pos+1; i < arr.length; i++) {
			if (arr[pos]!=arr[i]) {
				return i;
			}
		}
		return arr.length;
	}
	
	
	public static int position(int[] arr, int target)
    {	
		int pos = Arrays.binarySearch(arr, target);
		if (pos>=0) {
			pos = indexOfLastApperance(arr, pos);
		}else{
			pos = Math.abs(pos)-1;
		}
		return pos;
    }
}
