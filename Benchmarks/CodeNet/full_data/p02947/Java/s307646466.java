

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		List<char[]> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			String data=in.next();
			char[] arr=data.toCharArray();
			Arrays.sort(arr);
			list.add(arr);
		}
		int sum=0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if(i!=j){
					if(Arrays.equals(list.get(i), list.get(j))){
						sum++;
					}
				}
			}
		}
		sum=sum/2;
		System.out.println(sum);
		
	}
}
