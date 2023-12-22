
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		
		//String s = sc.next();
		/*
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);*/
		int[] x = new int[n];


		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}
		
		List<Integer> medianList = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				List<Integer> tempList = new ArrayList<>();
				for(int k=i;k<j+1;k++) {
					tempList.add(x[k]);
				}
				medianList.add(median(tempList));
			}
		}
		
		
		System.out.println(median(medianList));
	}
	
	static int median(List<Integer> tempList) {
		Collections.sort(tempList);
		return (int) tempList.get((int) (Math.floor(tempList.size()/2)));
	}
	/*
	static boolean check(int t,int x,int y) {
		if(Math.abs(x)+Math.abs(y)>t)return false;
		if((Math.abs(x)+Math.abs(y)-t)%2==0) {
			return true;
		}else {
			return false;
		}

	}
	*/
}