import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list1= new ArrayList<>();
		for(int i =0; i<N; i++){
			int b = 0;
			for(int j =0; j< 3; j++){
				int a = sc.nextInt();
				b += a;
			}
			list1.add(b);
		}
		Collections.sort(list1);
		System.out.println(list1.get(N-1)+list1.get(N-2)+list1.get(N-3));
	}
}