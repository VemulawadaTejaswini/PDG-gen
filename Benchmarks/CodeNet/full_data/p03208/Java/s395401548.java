
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int h;
		
		ArrayList<Integer> height = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			h = sc.nextInt();
			for(int j=0;j<height.size();j++) {
				if(height.get(j) > h) {
					height.add(j,h);
					break;
				}
			}
			height.add(h);
		}
		
		int min=1000000001;
		for(int i=0;i<n-k+1;i++) {
			min = Math.min(min, height.get(i+k-1) - height.get(i));
		}
		System.out.println(min);
		sc.close();
	}

}
