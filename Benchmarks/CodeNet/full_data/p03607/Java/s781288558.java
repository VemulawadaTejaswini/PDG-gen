import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),ans=0;
		
		for(int i=0;i<N;i++) 
			list.add(sc.nextInt());
		Collections.sort(list);
		
		for(int i=1;i<N;i++) 
		{
			int count = 0;
			while(i<N && list.get(i)==list.get(i-1))
			{
				count ++;i++;
			}
			ans +=  count % 2;
			
		}
		System.out.println(ans);
	}

}
