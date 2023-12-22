import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		for(int f = 0; f <= n*4; f+=4){
			for(int k = 0; k <= (n - f/4)*2; k+=2){
				for(int j = 0; j <= n - f/4 - k/2; j++){
					for(int i = 0; i <= (n -f/4 -k/2 -j)/2; i++){
						if(2*i + j + k/2 + f/4 == n){
							list1.add(a*f + b*k + c*j + d*i);	
						}
					}
				}
			}
		}
		Collections.sort(list1);
		System.out.println(list1.get(0));
	}
}