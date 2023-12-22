import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			List<Integer> list = new ArrayList<Integer>(n);
			for (int i = 1; i <= n; i++) {
				if(i%2==0){
					list.add(0,sc.nextInt());
				}else{
					list.add(sc.nextInt());
				}
			}
            for (int i = 0; i < n; i++) {
				System.out.print(list.get(i)+ " ");
			}

		    sc.close(); }
}
