import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = -1;
		int min = 1001;
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			if(max < a){
				max = a;
			}
			if(a < min){
				min = a;
			}
		}
		
		System.out.println(max-min);
		return;
	}
}